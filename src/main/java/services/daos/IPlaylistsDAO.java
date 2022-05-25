package services.daos;

import dtos.PlaylistDTO;

import java.sql.SQLException;
import java.util.List;

public interface IPlaylistsDAO {

    List<PlaylistDTO> getAllPlaylists(String token) throws SQLException, ClassNotFoundException;

    int getLength();
}
