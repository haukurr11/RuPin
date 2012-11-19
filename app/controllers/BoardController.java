package controllers;

import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.service.BoardNotFoundException;
import is.ru.honn.rupin.service.PinService;
import org.codehaus.jackson.node.ObjectNode;
import play.data.Form;
import play.libs.Json;
import play.mvc.Result;
import viewmodels.CreatePinModel;
import viewmodels.ViewBoardModel;
import views.html.board.createpin;
import views.html.board.myboards;
import views.html.board.viewboard;

import java.util.List;

public class BoardController extends RuPinController
{
    protected static PinService pinService = (PinService)ctx.getBean("pinService");
    final static Form<Pin> createPinForm = form(Pin.class);
    public static Result viewBoard(String username, String boardname)
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

    public static Result submitPin(String username, String boardname)
    {
        String loggedInUsername = session().get("username");
        if (loggedInUsername == null || !loggedInUsername.equals((username)))
            return redirect( routes.Session.login()  );
        Form<Pin> filledForm = createPinForm.bindFromRequest();
        try
            {
                pinService.createPin(username, boardname, filledForm.get().getLink(),
                                     filledForm.get().getDescription(), filledForm.get().getImage());
            }
        catch (BoardNotFoundException e)
            {
                e.printStackTrace();
            }
        return redirect( routes.BoardController.viewBoard(username, boardname) );
    }

    public static Result AddLike(String pinID)
    {
        int NumPinID = Integer.parseInt(pinID);
        String loggedInUsername = session().get("username");
        if (loggedInUsername == null)
            return redirect( routes.Session.login()  );
        pinService.addLike(loggedInUsername, NumPinID);
        int numOfLikes = pinService.getLikers(NumPinID).size();
        ObjectNode result = Json.newObject();
        result.put("likes", numOfLikes);
        return ok(result);
    }
    public static Result createPin(String username, String boardname)
    {
        String loggedInUsername = session().get("username");
        if (loggedInUsername == null || !loggedInUsername.equals((username)))
            return redirect( routes.Session.login()  );
        Board board = pinService.getBoard(username, boardname);
        CreatePinModel cpm = new CreatePinModel();
        cpm.setUser(userService.getUser(username));
        cpm.setBoard(pinService.getBoard(username, boardname));
        cpm.setFilledForm(createPinForm);
        return ok(createpin.render(cpm));
    }
}
