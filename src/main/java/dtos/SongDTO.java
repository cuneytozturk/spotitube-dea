package dtos;

public class SongDTO extends TrackDTO {
    private String album;

    public SongDTO(int id, String title, String performer, int duration, Boolean availableOffline, String album) {

        super(id, title, performer, duration, availableOffline);
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
