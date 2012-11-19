package is.ru.honn.rupin.data;

import is.ru.honn.rupin.domain.Pin;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PinRowMapper implements RowMapper
{
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException
    {
        Pin pin = new Pin(resultSet.getString(2),     // Description
                          resultSet.getString(1),     // link
                          resultSet.getString(3),     // image
                          resultSet.getInt(6)     // image
                         ) ;   // username
        return pin;
    }
}
