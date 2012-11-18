package viewmodels;

import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.domain.User;

/**
 * Creator: Haukur Rosinkranz
 */
public class ViewBoardModel {
    private Board board;
    private User user;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
