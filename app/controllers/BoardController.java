package controllers;

import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.service.PinService;
import play.mvc.Result;
import views.html.board.viewboard;

/**
 * Creator: Haukur Rosinkranz
 */
public class BoardController extends RuPinController{
    protected static PinService pinService = (PinService)ctx.getBean("pinService");
  public static Result viewBoard(String username,String boardname)
  {
      Board board = pinService.getBoard(username, boardname);
      board.setCreator(userService.getUser(username));
      return ok(viewboard.render(board));
  }
}
