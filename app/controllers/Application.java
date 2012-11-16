package controllers;

import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.service.PinService;
import is.ru.honn.rupin.service.UserService;
import play.mvc.Result;
import viewmodels.IndexModel;
import views.html.index;

public class Application extends RuPinController
{
 private static UserService userService = (UserService)ctx.getBean("userService");
 private static PinService pinService = (PinService)ctx.getBean("pinService");

 public static Result index()
  {
    String loggedInUsername = session().get("username");
    IndexModel current = new IndexModel();
    current.setUser(userService.getUser(loggedInUsername));
    if(loggedInUsername != null)
        return ok(index.render(current));
    return redirect( routes.Session.login()  );
  }

  public static Result viewBoard()
  {
      String loggedInUsername = session().get("username");
      Board board = new Board();
      board.setPins(pinService.getPinsOnBoard(loggedInUsername,"bord") );
      //return ok(viewboard.render(board))
      return TODO;
  }
}