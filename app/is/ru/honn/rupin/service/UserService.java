package is.ru.honn.rupin.service;

import is.ru.honn.rupin.data.UserDataGateway;
import is.ru.honn.rupin.domain.User;

import java.util.List;

public interface UserService
{
    public User signup(User user) throws UsernameExistsException;
    public User login(String username, String password);
    public User getUser(String username);
    public List<User> getFollowers(String username);
    public List<User> getUsersFollowedBy(String username);
    public void setUserDataGateway(UserDataGateway userDataGateway);
    public void AddFollower(String username, String following);
}

