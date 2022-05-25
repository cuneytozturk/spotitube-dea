package dtos;

public class VideoDTO extends TrackDTO {
    private String publicationDate;
    private String description;

    public VideoDTO(int id, String title, String performer, int duration, Boolean availableOffline, String publicationDate, String description) {
        super(id, title, performer, duration, availableOffline);
        this.publicationDate = publicationDate;
        this.description = description;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
