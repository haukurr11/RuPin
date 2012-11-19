package is.ru.honn.rupin.data;

import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.domain.User;
import is.ruframework.data.RuDataAccess;

import java.util.List;

public interface PinDataGateway extends RuDataAccess
{
  public int add(Pin pin, String boardname, String username);
  public int addLike(String username, int pinID);
  public List<User> getLikers(int pinID);
  public List<Pin> getPinsOnBoard(String boardname, String username);
}
