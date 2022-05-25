package dtos;

import java.util.ArrayList;
import java.util.List;

public class PlaylistsDTO {
private List<PlaylistDTO> playlists = new ArrayList<PlaylistDTO>();
private int length;

    public PlaylistsDTO() {
    }

    public List<PlaylistDTO> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<PlaylistDTO> playlists) {
        this.playlists = playlists;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
