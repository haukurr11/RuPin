package is.ru.honn.rupin.data;

import is.ru.honn.rupin.domain.User;
import is.ruframework.data.RuDataAccess;

import java.util.List;

public interface UserDataGateway extends RuDataAccess
{
    /**
     * add
     * @param user The user being added
     * @return
     */

    public int add(User user);

    /**
     * getUserByUsername
     * @param username Nafn á user sem sækja á
     * @return
     */

    public User getUserByUsername(String username);

    /**
     * getUserByID
     * @param id identity of the user you want to get
     * @return
     */

    public User getUserByID(int id);

    /**
     * getFollowersOf
     * @param username Name of the user you want to get the followers of
     * @return
     */

    public List<User> getFollowersOf(String username);

    /**
     * getUsersFollowedBy
     * @param username Name of the users you want to see the followers of
     * @return
     */

    public List<User> getUsersFollowedBy(String username);

    /**
     * addFollower
     * @param username Name of the user that wants to follow
     * @param following Name of the user that wants to follow
     */

    public void addFollower(String username, String following);

    /**
     * stopFollowing
     * @param username Username of the user you want to stop following
     * @param following Name of the user following
     */

    public void stopFollowing(String username, String following);
}
