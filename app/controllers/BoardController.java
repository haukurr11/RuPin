package controllers;

import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.service.PinService;
import play.mvc.Result;
import viewmodels.ViewBoardModel;
import views.html.board.*;

import java.util.List;

/**
 * Creator: Haukur Rosinkranz
 */
public class BoardController extends RuPinController{
    protected static PinService pinService = (PinService)ctx.getBean("pinService");
  public static Result viewBoard(String username,String boardname)
  {
      String loggedInUsername = session().get("username");
      if(loggedInUsername == null)
         return redirect( routes.Session.login()  );
      Board board = pinService.getBoard(username, boardname);
      board.setCreator(userService.getUser(username));
      ViewBoardModel vbm = new ViewBoardModel();
      vbm.setUser(userService.getUser(loggedInUsername));
      vbm.setBoard(board);
      return ok(viewboard.render(vbm));
  }
  public static Result myBoards()
  {
      String loggedInUsername = session().get("username");
      if(loggedInUsername == null)
         return redirect( routes.Session.login()  );
      List<Board> boards = pinService.getBoards(loggedInUsername);
      for(Board b : boards) b.setCreator(userService.getUser(loggedInUsername));
      return ok(myboards.render(boards));
  }
}
