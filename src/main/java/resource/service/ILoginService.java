package resource.service;

import dtos.LoginDTO;
import dtos.UserDTO;

import java.sql.SQLException;

public interface ILoginService {
    String authenticate(LoginDTO login) throws SQLException, ClassNotFoundException;
}
