package dtos;

public abstract class TrackDTO {
    private int id;
    private String title;
    private String performer;
    private int duration;
    private Boolean availableOffline;

    public TrackDTO(int id, String title, String performer, int duration, Boolean availableOffline) {
        this.id = id;
        this.title = title;
        this.performer = performer;
        this.duration = duration;
        this.availableOffline = availableOffline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Boolean getAvailableOffline() {
        return availableOffline;
    }

    public void setAvailableOffline(Boolean availableOffline) {
        this.availableOffline = availableOffline;
    }
}
