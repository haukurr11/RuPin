package viewmodels;

import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.domain.User;

import java.util.List;

public class IndexModel  {
    protected User user;
    public List<Pin> list;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public List<Pin> getPins()
    {
        return list;
    }

}
