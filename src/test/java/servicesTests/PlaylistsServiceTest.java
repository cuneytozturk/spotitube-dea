//package servicesTests;
//
//import resource.PlaylistResource;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import services.PlaylistService;
//import services.PlaylistsService;
//import services.TrackService;
//
//class PlaylistsServiceTest {
//    private PlaylistResource sut;
//    private PlaylistsService playlistsService;
//    private PlaylistService playlistService;
//    private TrackService trackService;
//
//    @Before
//    public void setup(){
//        playlistsService = new PlaylistsService();
//
//        sut = new PlaylistResource(playlistsService, playlistService);
//    }
//
//
//
//
//    @Test
//    void calculateTotalPlaylistsLengthReturnsCorrectLength() {
//        trackService = new TrackService();
//        playlistsService = new PlaylistsService();
//        trackService.addTrackToPlaylist(playlistsService.getPlaylist(1), trackService.getTrack(2));
//        trackService.addTrackToPlaylist(playlistsService.getPlaylist(1), trackService.getTrack(3));
//
//        int expected = 600;
//        int actual = playlistsService.calculateTotalPlaylistsLength();
//        Assert.assertEquals(expected,actual);
//    }
//}