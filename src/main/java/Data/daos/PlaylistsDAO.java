package Data.daos;

import Data.connection.DatabaseConnection;
import dtos.PlaylistDTO;
import dtos.PlaylistsDTO;
import dtos.UserDTO;
import services.daos.ILoginDAO;
import services.daos.IPlaylistsDAO;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Default
public class PlaylistsDAO implements IPlaylistsDAO {
    private DatabaseConnection databaseConnection;
    private ILoginDAO loginDAO;


    @Inject
    public void setLoginDAO(LoginDAO loginDAO){
        this.loginDAO=loginDAO;
    }

    @Inject
    public void setDatabaseConnection(DatabaseConnection databaseConnection){
        this.databaseConnection=databaseConnection;
    }

    @Override
    public List<PlaylistDTO> getAllPlaylists(String token) throws SQLException, ClassNotFoundException {
        String playlistsQuery = "SELECT * FROM PLAYLISTS";
        UserDTO user = loginDAO.getUser(token);

        Connection connection = databaseConnection.initiateConnection();
        ResultSet resultset = connection.prepareStatement(playlistsQuery).executeQuery();

        List<PlaylistDTO> allPlaylists = new ArrayList<PlaylistDTO>();

        while (resultset.next()) {
            PlaylistDTO playlist = new PlaylistDTO();
            playlist.setId(resultset.getInt("id"));

            //If the owner_id is equal to the user_id of the user from the given token, owner is set to true
            if(resultset.getInt("owner_id")==user.getId()){
                playlist.setOwner(true);
            } else {
                playlist.setOwner(false);
            }

            playlist.setName(resultset.getString("name"));

            allPlaylists.add(playlist);
        }

        return allPlaylists;
    }

    @Override
    public int getLength() {
        return 0;
    }
}
