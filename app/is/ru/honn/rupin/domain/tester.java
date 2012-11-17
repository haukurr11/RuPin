package is.ru.honn.rupin.domain;

import is.ru.honn.rupin.data.PinDataGateway;
import is.ru.honn.rupin.data.UserDataGateway;
import is.ru.honn.rupin.service.PinService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Creator: Haukur Rosinkranz
 */
public class tester {
  public static void main(String args[])
  {
    ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/ApplicationContext.xml");
    UserDataGateway userDataGateway = (UserDataGateway)ctx.getBean("userDataGateway");
    PinDataGateway pinDataGateway = (PinDataGateway)ctx.getBean("pinDataGateway");
    List<User> users = userDataGateway.getUsersFollowedBy("knutur");
    List<User> users2 = userDataGateway.getFollowersOf("lallijohns");
    User user1 = userDataGateway.getUserByUsername("haukurr11");
    User user2 = userDataGateway.getUserByUsername("knutur");
    System.out.println();
    for(User user: users)
        System.out.println(user);
    System.out.println("-----");
    for(User user: users2)
        System.out.println(user);
    PinService pinService = (PinService)ctx.getBean("pinService");
    Board board = pinService.getBoard("knutur", "Inspiration");
    System.out.println(board.getPins().size());
    for(Pin pin : board.getPins())
        System.out.println(pin.getLink());
  }

}
