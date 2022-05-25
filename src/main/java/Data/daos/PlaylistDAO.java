//package Data.daos;
//
//import dtos.TrackDTO;
//import services.daos.IPlaylistDAO;
//
//import java.util.List;
//
//public class PlaylistDAO implements IPlaylistDAO {
//    @Override
//    public List<TrackDTO> getAllTracksFromPlaylist(int playlistID) {
//        String GET_TRACKS_QUERY = "SELECT * FROM PLAYLIST WHERE ID = "+playlistID;
//        List<TrackDTO> tracks = IETSMETSQL.BUILDMAAKTSTRING(GET_TRACKS_QUERY);
//
//        return tracks;
//    }
//}
