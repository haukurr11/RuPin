package controllers;

import is.ru.honn.rupin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import play.mvc.Controller;

public class RuPinController extends Controller
{
  protected static ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/ApplicationContext.xml");
  protected static UserService userService = (UserService)ctx.getBean("userService");
}
