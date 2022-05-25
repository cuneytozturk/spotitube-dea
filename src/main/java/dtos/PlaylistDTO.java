package dtos;

public class PlaylistDTO {
    private int id;
private String name;
private Boolean owner;
private TracksDTO tracks = new TracksDTO();

    public PlaylistDTO(){
    }

    public PlaylistDTO(int id, String name, Boolean owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public TracksDTO getTracks() {
        return tracks;
    }

    public void setTracks(TracksDTO tracks) {
        this.tracks = tracks;
    }
}
