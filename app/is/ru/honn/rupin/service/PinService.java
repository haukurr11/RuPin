package is.ru.honn.rupin.service;

/**
 * Created with IntelliJ IDEA.
 * Created by: Haukur Rósinkranz, Knútur Óli Magnússon
 * 13.11.2012 - 20.11.2012
 */

import is.ru.honn.rupin.data.BoardDataGateway;
import is.ru.honn.rupin.data.PinDataGateway;
import is.ru.honn.rupin.data.UserDataGateway;
import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.domain.User;

import java.util.List;

public interface PinService
{
    public Board getBoard(String username, String boardname);
    public List<Board> getBoards(String username);
    public Board createBoard (String username, String boardname,
                              String category)

    throws UserNotFoundException;
    public Pin createPin (String username, String boardname,
                          String link, String description, String image)
    throws BoardNotFoundException;
    public List<Pin> getPinsOnBoard(String username, String boardname) throws UserNotFoundException;
    public List<Board> getFollowedBoards(String username);
    public void setUserDataGateway(UserDataGateway userDataGateway);
    public void setBoardDataGateway(BoardDataGateway boardDataGateway);
    public void setPinDataGateway(PinDataGateway pinDataGateway);
    public void addLike(String username, int pinID);
    public List<User> getLikers(int pinID);
}
