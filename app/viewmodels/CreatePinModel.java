package viewmodels;

import is.ru.honn.rupin.domain.Board;
import is.ru.honn.rupin.domain.Pin;
import is.ru.honn.rupin.domain.User;
import play.data.Form;

public class CreatePinModel {
    User user;
    Board board;
    Pin pin;
    Form<Pin> filledForm;

    public Form<Pin> getFilledForm() {
        return filledForm;
    }

    public void setFilledForm(Form<Pin> filledForm) {
        this.filledForm = filledForm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Pin getPin() {
        return pin;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }
}
