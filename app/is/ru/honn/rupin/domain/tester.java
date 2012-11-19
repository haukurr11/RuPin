package is.ru.honn.rupin.domain;

import is.ru.honn.rupin.service.PinService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Creator: Haukur Rosinkranz
 */
public class tester
{
    public static void main(String args[])
    {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/ApplicationContext.xml");
        PinService pinService = (PinService)ctx.getBean("pinService");
        pinService.getLikers(6);
        for(User user: pinService.getLikers(6))
            System.out.println(user);
    }

}
