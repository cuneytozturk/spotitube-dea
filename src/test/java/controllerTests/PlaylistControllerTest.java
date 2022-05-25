//package controllerTests;
//
//import resource.PlaylistResource;
//import dtos.PlaylistDTO;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import services.PlaylistService;
//import services.PlaylistsService;
//
//import javax.ws.rs.core.Response;
//
//public class PlaylistControllerTest {
//    private PlaylistResource sut;
//    private PlaylistsService playlistsService;
//    private PlaylistService playlistService;
//
//    @Before
//    public void setup(){
//        playlistsService = new PlaylistsService();
//        playlistService = new PlaylistService();
//        sut = new PlaylistResource(playlistsService,playlistService);
//    }
//
//    @Test
//    public void validateToken() {
//        String token = "1234-1234-1234";
//        boolean actual = sut.validateToken(token);
//        boolean expected= true;
//
//    }
//
//    @Test
//    public void ifTokenCorrectPlaylistsAreReturned(){
//        String token = "1234-1234-1234";
//        Response expected = Response.ok().entity(playlistsService.getAllPlaylists()).build();
//        Response actual = sut.getAllPlaylists(token);
//
//        Assert.assertEquals(expected.getEntity(), actual.getEntity());
//    }
//
//    @Test
//    public void correctPlaylistReturnedWithPlaylistID(){
//        String token = "1234-1234-1234";
//        PlaylistDTO playlist = playlistsService.getPlaylist(2);
//
//        Response expected = Response
//                .status(Response.Status.OK)
//                .entity(playlistService.getTracksFromPlaylist(playlist))
//                .build();
//
//        Response actual = sut.getPlaylist(token, 2);
//        Assert.assertEquals(expected.getEntity(), actual.getEntity());
//
//    }}