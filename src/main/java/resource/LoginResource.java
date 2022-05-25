package resource;

import dtos.LoginDTO;
import exceptions.UnauthorizedException;
import resource.service.ILoginService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/login")
public class LoginResource {


    private ILoginService loginService;

    @Inject
    public void setLoginService(ILoginService loginService){
        this.loginService=loginService;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(LoginDTO login) {
        try{
            return Response
                    .status(Response.Status.OK)
                    .entity(loginService.authenticate(login))
                    .type(MediaType.APPLICATION_JSON)
                    .build();
        }catch (UnauthorizedException | SQLException | ClassNotFoundException e){
            return Response
                    .status(Response.Status.UNAUTHORIZED)
                    .build();
        }
    }
    }
