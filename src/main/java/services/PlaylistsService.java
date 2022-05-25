package services;

//import daos.PlaylistDAO;

import dtos.PlaylistDTO;
import dtos.PlaylistsDTO;
//import services.daos.IPlaylistDAO;
import resource.service.IPlaylistsService;
import services.daos.IPlaylistsDAO;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.DataFormatException;

@Default
public class PlaylistsService implements IPlaylistsService {

    private IPlaylistsDAO playlistsDAO;


    @Inject
    public void setPlaylistsDAO(IPlaylistsDAO playlistsDAO){
        this.playlistsDAO=playlistsDAO;
    }

    public PlaylistsDTO getAllPlaylists(String token) throws SQLException, ClassNotFoundException {
        PlaylistsDTO playlists = new PlaylistsDTO();
        playlists.setPlaylists(playlistsDAO.getAllPlaylists(token));
        playlists.setLength(playlistsDAO.getLength());
        return playlists;
    }
//
//    public PlaylistDTO getPlaylist(int playlistID){
//        List<PlaylistDTO> resultPlaylist= playlists.stream().filter(p -> p.getId() == playlistID).collect(Collectors.toList());
//        return resultPlaylist.get(0);
//    }
//
//    public int calculateTotalPlaylistsLength(){
//        int playlistDuration = 0;
//        for(int i=0;i < playlists.size();i++){
//            for(int j = 0; j <playlists.get(i).getTracks().getTracks().size(); j++) {
//                playlistDuration = playlistDuration + playlists.get(i).getTracks().getTracks().get(j).getDuration();
//            }
//        }
//        return playlistDuration;
//    }
//
//    public List<PlaylistDTO> getPlaylists() {
//        return playlists;
//    }
}
