package is.ru.honn.rupin.domain;

import is.ru.honn.rupin.data.UserDataGateway;
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
    List<User> users = userDataGateway.getUsersFollowedBy("knutur");
    List<User> users2 = userDataGateway.getFollowersOf("lallijohns");
     for(User user: users)
         System.out.println(user);
    System.out.println("-----");
     for(User user: users2)
         System.out.println(user);
  }

}
