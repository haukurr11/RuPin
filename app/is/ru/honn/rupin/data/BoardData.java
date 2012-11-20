package is.ru.honn.rupin.data;

/**
 * Created with IntelliJ IDEA.
 * Created by: Haukur Rósinkranz, Knútur Óli Magnússon
 * 13.11.2012 - 20.11.2012
 */

import is.ru.honn.rupin.domain.Board;
import is.ruframework.data.RuData;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BoardData handles the implementation of BoardDataGateway
 * that maps to the ru_boards table in the database
 */

public class BoardData extends RuData implements BoardDataGateway
{
    @Override
    public int add(Board board, String username)
    {
        SimpleJdbcInsert insert =
            new SimpleJdbcInsert(getDataSource())
        .withTableName("ru_boards");
        Map<String, Object> parameters = new HashMap<String, Object>(3);
        parameters.put("boardname", board.getName());
        parameters.put("category", board.getCategory());
        parameters.put("username", username);
        return insert.execute(parameters);
    }

    @Override
    public Board getBoard(String username, String boardname)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        return (Board)jdbcTemplate.queryForObject(
                   "select * from ru_boards where username='"
                   + username + "' and boardname='" + boardname + "'",
                   new BoardRowMapper() );
    }

    @Override
    public List<Board> getBoards(String username)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        List<Board> boards = (List<Board>)jdbcTemplate.query(
                                 "select * from ru_boards where username='"
                                 + username + "'", new BoardRowMapper());
        return boards;
    }
}
