package is.ru.honn.rupin.domain;

import is.ru.honn.rupin.service.PinService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Creator: Haukur Rosinkranz
 */
public class tester {
  public static void main(String args[])
  {
    ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/ApplicationContext.xml");
    PinService pinService = (PinService)ctx.getBean("pinService");

    Board board = pinService.getBoard("knutur", "Inspiration");
    System.out.println(board.getPins().get(0).getCreator());

  }

}
