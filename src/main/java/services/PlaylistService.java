//package services;
//
//import dtos.PlaylistDTO;
//import dtos.TrackDTO;
//import dtos.TracksDTO;
//import resource.service.IPlaylistService;
//import services.daos.IPlaylistDAO;
//
//import javax.inject.Inject;
//import java.util.List;
//
//public class PlaylistService implements IPlaylistService {
//
//
//    private IPlaylistDAO playlistDAO;
//
//    @Inject
//    public void setPlaylistDAO (IPlaylistDAO playlistDAO){
//        this.playlistDAO = playlistDAO;
//    }
//
//    @Override
//    public List<TrackDTO> getAllTracksFromPlaylist(int playlistID) {
//        return playlistDAO.getAllTracksFromPlaylist(playlistID);
//    }
//}
