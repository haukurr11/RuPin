package is.ru.honn.rupin.data;

import is.ru.honn.rupin.domain.Board;

import java.util.List;

public interface BoardDataGateway
{
    /**
     * Interface BoardDataGateway
     *
     * add
     * @param board what board to add to
     * @param username username name of the user adding this board
     * @return
     */
    public int add(Board board, String username);

    /**
     * getBoard
     * @param username  username of the user that owns it
     * @param boardname Name of the board you want to get
     * @return
     */
    public Board getBoard(String username, String boardname);

    /**
     * getBoards
     * @param username name of the user you want see
     *                 a list of owned boards
     * @return
     */
    public List<Board> getBoards(String username);

}

