package is.ru.honn.rupin.service;

import is.ru.honn.rupin.data.BoardDataGateway;
import is.ru.honn.rupin.data.PinDataGateway;
import is.ru.honn.rupin.data.UserDataGateway;
import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.domain.Pin;

import java.util.List;

public interface PinService
{
  public Board getBoard(String username, String boardname);
  public List<Board> getBoards(String username);
  public Board createBoard (String username, String boardname,
                            String category)

    throws UserNotFoundException;
  public Pin createPin (String username, String boardname,
                        String link, String description)
    throws BoardNotFoundException;
  public List<Pin> getPinsOnBoard(String username, String boardname) throws UserNotFoundException;
  public List<Board> getFollowedBoards(String username);
  public void setUserDataGateway(UserDataGateway userDataGateway);
  public void setBoardDataGateway(BoardDataGateway boardDataGateway);
  public void setPinDataGateway(PinDataGateway pinDataGateway);
}
