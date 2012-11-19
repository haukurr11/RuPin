package viewmodels;

import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.domain.User;

import java.util.List;

public class IndexModel
{
    private User user;
    private List<Pin> pins;
    public User getUser()
    {
        return user;
    }
    public void setUser(User user)
    {
        this.user = user;
    }
    public List<Pin> getPins()
    {
        return pins;
    }

    public void setPins(List<Pin> pins)
    {
        this.pins = pins;
    }
}
