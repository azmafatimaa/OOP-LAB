public class Movie {
    private String title;
    private String genre;
    private int duration; // minutes
    private String showTime;

    public Movie(String title, String genre, int duration, String showTime) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showTime = showTime;
    }
    public String toString() {
        return title + " (" + genre + ", " + duration + "min, " + showTime + ")";

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public String getShowTime() {
        return showTime;
    }
}
