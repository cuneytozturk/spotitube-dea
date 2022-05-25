package Data.connection;

import javax.inject.Inject;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private DatabaseProperties databaseProperties;

    public DatabaseConnection() throws IOException {
    }

    public Connection initiateConnection() throws ClassNotFoundException, SQLException {
        Class.forName(databaseProperties.getDriver());
        Connection connection= DriverManager.getConnection(databaseProperties.getConnectionstring());
        return connection;
    }

    @Inject
    public void setDatabaseProperties(DatabaseProperties databaseProperties){
        this.databaseProperties=databaseProperties;
    }
}
