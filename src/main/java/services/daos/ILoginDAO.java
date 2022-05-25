package services.daos;

import dtos.UserDTO;

import java.sql.SQLException;

public interface ILoginDAO {
    UserDTO getUser(String username, String password) throws SQLException, ClassNotFoundException;

    UserDTO getUser(String token) throws SQLException, ClassNotFoundException;
}
