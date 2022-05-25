package services;

import dtos.PlaylistDTO;
import dtos.SongDTO;
import dtos.TrackDTO;
import dtos.VideoDTO;

import java.util.ArrayList;
import java.util.List;

public class TrackService {
    List<TrackDTO> tracksList = new ArrayList<TrackDTO>();

    public TrackService() {
        tracksList.add( new SongDTO(1,"R U Mine", "Arctic Monkeys", 180,false, "AM"));
        tracksList.add( new SongDTO(2,"I Wanna Be Yours", "Arctic Monkeys", 190,false, "AM"));
        tracksList.add( new SongDTO(3,"Deep Fried Frenz", "MF DOOM", 300,true, "MM..FOOD"));
        tracksList.add( new VideoDTO(4,"Filet-O-Rapper", "MF DOOM", 300,true, "19-10-2014" , "Song by MF DOOM" ));
    }

    public void addTrackToPlaylist(PlaylistDTO playlist, TrackDTO track){
        playlist.getTracks().getTracks().add(track);
    }

    public TrackDTO getTrack(int trackID) {
        return tracksList.get(trackID);
    }

}
