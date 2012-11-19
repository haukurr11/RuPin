package is.ru.honn.rupin.data;

import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.domain.User;
import is.ruframework.data.RuData;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PinData extends RuData implements PinDataGateway
{
    @Override
    public int add(Pin pin, String boardname, String username)
    {
        SimpleJdbcInsert insert =
            new SimpleJdbcInsert(getDataSource())
        .withTableName("ru_pins").usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<String, Object>(5);
        parameters.put("description", pin.getDescription());
        parameters.put("link", pin.getLink());
        parameters.put("image", pin.getImage());
        parameters.put("boardname", boardname);
        parameters.put("username", username);

        return insert.execute(parameters);
    }

    @Override
    public int addLike(String username, int pinID)
    {
        SimpleJdbcInsert insert =
            new SimpleJdbcInsert(getDataSource())
        .withTableName("ru_likes");
        Map<String, Object> parameters = new HashMap<String, Object>(3);

        parameters.put("isActive", 1);
        parameters.put("username", username);
        parameters.put("pinID", pinID);
        try
            {
                return insert.execute(parameters);
            }
        catch(DataIntegrityViolationException divex)
            {
                return -1;
            }
    }

    @Override
    public List<User> getLikers(int pinID)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        List<User> users = (List<User>)jdbcTemplate.query(
                               "select ru_users.* from ru_users,ru_likes where ru_likes.pinID="
                               + pinID + " and ru_likes.username=ru_users.username", new UserRowMapper());
        return users;
    }

    @Override
    public List<Pin> getPinsOnBoard(String username, String boardname)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        List<Pin> pins = (List<Pin>)jdbcTemplate.query(
                             "select * from ru_pins where username='"
                             + username + "' and boardname='" + boardname
                             + "'", new PinRowMapper());
        return pins;
    }
}
