package services;

import Data.daos.LoginDAO;
import dtos.LoginDTO;
import dtos.UserDTO;
import exceptions.UnauthorizedException;
import resource.service.ILoginService;
import services.daos.ILoginDAO;

import javax.inject.Inject;
import java.sql.SQLException;

public class LoginService implements ILoginService {

    private ILoginDAO loginDAO;

    @Override
    public String authenticate(LoginDTO login) throws SQLException, ClassNotFoundException {
            UserDTO user = loginDAO.getUser(login.getUsername(), login.getPassword());

            String response = "{\n" +
                    "  \"token\":  \"" + user.getToken() + "\", \n" +
                    "  \"user\":   \"" + user.getUsername() + "\"\n" +
                    "}";

            return response;
    }

    @Inject
    public void setLoginDAO(LoginDAO loginDAO){
        this.loginDAO=loginDAO;
    }
}
