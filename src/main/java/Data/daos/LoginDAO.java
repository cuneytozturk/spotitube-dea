package Data.daos;

import Data.connection.DatabaseConnection;
import dtos.UserDTO;
import services.daos.ILoginDAO;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.sql.*;

@Default
public class LoginDAO implements ILoginDAO {
    private DatabaseConnection databaseConnection;

    @Override
    public UserDTO getUser(String username, String password) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnection.initiateConnection();
        String getUserQuery = "SELECT * FROM user where username= \"" + username + "\" AND password= \"" + password + "\";";

        ResultSet resultset = connection.prepareStatement(getUserQuery).executeQuery();

        UserDTO user = new UserDTO();
        while (resultset.next()) {
            user.setId(resultset.getInt("user_id"));
            user.setUsername(resultset.getString("username"));
            user.setPassword(resultset.getString("password"));
            user.setToken(resultset.getString("token"));
        }

        return user;

    }

    @Override
    public UserDTO getUser(String token) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnection.initiateConnection();
        String getUserQuery = "SELECT * FROM user where token= \"" + token + "\";";

        ResultSet resultset = connection.prepareStatement(getUserQuery).executeQuery();

        UserDTO user = new UserDTO();
        while (resultset.next()) {
            user.setId(resultset.getInt("user_id"));
            user.setUsername(resultset.getString("username"));
            user.setPassword(resultset.getString("password"));
            user.setToken(resultset.getString("token"));
        }

        return user;

    }

    @Inject
    public void setDatabaseConnection(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
}
