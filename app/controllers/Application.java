package controllers;

import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.domain.User;
import is.ru.honn.rupin.service.PinService;
import is.ru.honn.rupin.service.UserService;
import play.mvc.Result;
import viewmodels.IndexModel;
import views.html.index;

import java.util.ArrayList;
import java.util.List;

public class Application extends RuPinController
{
 private static UserService userService = (UserService)ctx.getBean("userService");
 private static PinService pinService = (PinService)ctx.getBean("pinService");

 public static Result index()
  {
    String loggedInUsername = session().get("username");
    if(loggedInUsername == null)
            return redirect( routes.Session.login()  );
    IndexModel current = new IndexModel();
    current.setUser(userService.getUser(loggedInUsername));
    List<Pin> followedPins = new ArrayList<>();
    for(User user : userService.getUsersFollowedBy(loggedInUsername))
        for(Board board : pinService.getBoards(user.getUsername() ))
        {
            board.setCreator(userService.getUser(user.getUsername()));
            followedPins.addAll(board.getPins());
        }
    current.list = followedPins;
    return ok(index.render(current));
 }


}