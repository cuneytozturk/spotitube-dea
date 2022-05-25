package Data.connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProperties {
    private String driver;
    private String connectionstring;

    public DatabaseProperties() throws IOException {
        FileInputStream databasePropertiesFIS = new FileInputStream("C:\\Users\\june8\\OneDrive-HAN\\Documents\\school\\Spotitube\\spotitube\\src\\main\\resources\\database.properties");
        Properties p = new Properties();
        p.load(databasePropertiesFIS);
        this.driver= (String) p.get ("driver");
        this.connectionstring = (String) p.get ("connectionstring");
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getConnectionstring() {
        return connectionstring;
    }

    public void setConnectionstring(String connectionstring) {
        this.connectionstring = connectionstring;
    }
}
