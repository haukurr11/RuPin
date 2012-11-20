package controllers;

/**
 * Created with IntelliJ IDEA.
 * Created by: Haukur Rósinkranz, Knútur Óli Magnússon
 * 13.11.2012 - 20.11.2012
 */

import is.ru.honn.rupin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import play.mvc.Controller;

/**
 * RuPinController maps certain resources
 */

public class RuPinController extends Controller
{
    protected static ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/ApplicationContext.xml");
    protected static UserService userService = (UserService)ctx.getBean("userService");
}
