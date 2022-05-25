package resource;

import dtos.PlaylistDTO;
import exceptions.UnauthorizedException;
import resource.service.ILoginService;
//import resource.service.IPlaylistService;
import resource.service.IPlaylistsService;

import javax.inject.Inject;
import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/playlists")
public class PlaylistResource {
//    private IPlaylistService playlistService;
    private IPlaylistsService playlistsService;
    private ILoginService loginService;

//    @Inject
//    public void setPlaylistService(IPlaylistService playlistService){
//        this.playlistService=playlistService;
//    }

   @Inject
   public void setPlaylistsService(IPlaylistsService playlistsService){
       this.playlistsService=playlistsService;
   }

   @Inject
   public void setLoginService(ILoginService loginService){
       this.loginService=loginService;
   }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPlaylists(@QueryParam("token") String token) {
        try{
            return Response
                    .status(Response.Status.OK)
                    .entity(playlistsService.getAllPlaylists(token))
                    .build();
        }catch(UnauthorizedException | SQLException | ClassNotFoundException e){
            return Response
                    .status(Response.Status.UNAUTHORIZED)
                    .build();
        }
    }

//    @GET
//    @Path("{playlistID}/tracks")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getPlaylist(@QueryParam("token") String token, @PathParam("playlistID") int playlistID) {
//       try{
//           return Response
//                   .status(Response.Status.OK)
//                   .entity(playlistService.getAllTracksFromPlaylist(playlistID))
//                   .build();
//       }catch(UnauthorizedException e){
//           return Response
//                   .status(Response.Status.BAD_REQUEST)
//                   .build();
//        }
//
//    }


}
