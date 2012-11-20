package is.ru.honn.rupin.data;

import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.domain.User;
import is.ruframework.data.RuDataAccess;

import java.util.List;

public interface PinDataGateway extends RuDataAccess
{
    /**
     * add adds a pin to the database
     * @param pin Pin being added
     * @param boardname Name of the board the pin should go on
     * @param username Name of the user that is adding this pin
     * @return
     */
    public int add(Pin pin, String boardname, String username);

    /**
     * addLike
     * @param username Name of the user liking this pin
     * @param pinID  Id of the pin that this user likes
     * @return
     */

    public int addLike(String username, int pinID);

    /**
     * getLikers
     * @param pinID Id of the pin you want to know the number of likes of.
     * @return
     */
    public List<User> getLikers(int pinID);

    /**
     * getPinsOnBoard
     * @param boardname Name of the board you want to get the pins on
     * @param username Name of the user that owns this board
     * @return
     */

    public List<Pin> getPinsOnBoard(String boardname, String username);
}
