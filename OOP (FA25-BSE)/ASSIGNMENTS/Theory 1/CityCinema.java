public class CityCinema {
    String cinemaName;
    CinemaScreen[] screens;
    String city;

    public CityCinema(String cinemaName, int screenCount, String city,Movie[] movies) {
        this.cinemaName = cinemaName;
        this.city = city;
        screens = new CinemaScreen[screenCount];
        for (int i = 0; i < screens.length; i++) {

            String screenType = (i % 2 == 0) ? "2D" : "3D";
            Movie movie =movies[i % movies.length];
            screens[i] = new CinemaScreen("Screen " + (i+1), "S" + (i+1), screenType, movie);
        }
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cinema: ").append(cinemaName).append(" | City: ").append(city).append("\n");
        for (CinemaScreen screen : screens) {
            stringBuilder.append(screen).append("\n");
        }
        return stringBuilder.toString();
    }

    }



