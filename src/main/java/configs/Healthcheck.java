package configs;

import Data.connection.DatabaseConnection;
import dtos.UserDTO;
import exceptions.UnauthorizedException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

@Path("/health")
public class Healthcheck {
private DatabaseConnection databaseConnection;

        @GET
        public String healthy()  {
return "healthy";
        }

    }


