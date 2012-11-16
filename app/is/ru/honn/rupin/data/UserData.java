package is.ru.honn.rupin.data;

import is.ru.honn.rupin.domain.User;
import is.ruframework.data.RuData;
import is.ruframework.data.RuDuplicateDataException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserData extends RuData implements UserDataGateway
{
  public int add(User user)
  {
    SimpleJdbcInsert insert =
        new SimpleJdbcInsert(getDataSource())
            .withTableName("ru_users")
            .usingGeneratedKeyColumns("id");

    Map<String, Object> parameters = new HashMap<String, Object>(7);
    parameters.put("username", user.getUsername());
    parameters.put("name", user.getName());
    parameters.put("password", user.getPassword());
    parameters.put("email", user.getEmail());

    int returnKey;

    try
    {
      returnKey = insert.executeAndReturnKey(parameters).intValue();
    }
    catch(DataIntegrityViolationException divex)
    {
      throw new RuDuplicateDataException("User " + user.getUsername() + " already exits", divex);
    }

    user.setId(returnKey);
    return returnKey;
  }

  public User getUserByUsername(String username)
  {
    Collection<String> users;
    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

    User user;
    try
    {
      user = (User)jdbcTemplate.queryForObject(
          "select * from ru_users where username = '" + username + "'", new UserRowMapper());
    }
    catch (EmptyResultDataAccessException erdaex)
    {
      return null;
    }
    return user;
  }

    public User getUserByID(int id)
    {
        Collection<String> users;
        JdbcTemplate simpleJdbcTemplate = new JdbcTemplate(getDataSource());
        User user = (User) simpleJdbcTemplate.queryForObject(
                "select * from users where id="+id, new UserRowMapper());
        return user;
    }

   public List<User> getFollowersOf(String username)
  {
    Collection<String> users;
    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

    List<User> followers;
    try
    {
      followers = (List<User>)jdbcTemplate.query(
              "select ru_users.* from ru_users,ru_followers where ru_followers.following='" + username + "' and ru_followers.username=ru_users.username"
              , new UserRowMapper());
    }
    catch (EmptyResultDataAccessException erdaex)
    {
      return null;
    }
    return followers;
  }


    @Override
    public List<User> getUsersFollowedBy(String username) {
    Collection<String> users;
    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
    List<User> followers;
    try
    {
      followers = (List<User>)jdbcTemplate.query(
              "select ru_users.* from ru_users,ru_followers where ru_followers.username='" + username + "' and ru_followers.following=ru_users.username"
              , new UserRowMapper());
    }
    catch (EmptyResultDataAccessException erdaex)
    {
      return null;
    }
    return followers;
    }

}
