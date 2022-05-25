package resource.service;

import dtos.PlaylistsDTO;

import java.sql.SQLException;

public interface IPlaylistsService {
    PlaylistsDTO getAllPlaylists(String token) throws SQLException, ClassNotFoundException;
}
