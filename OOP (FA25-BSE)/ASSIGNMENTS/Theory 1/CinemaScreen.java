public class CinemaScreen {

    String screenName;
    String screenId;
    String screenType;
    Movie movie;
    Seat[][] seats;

    public CinemaScreen(String screenName, String screenId, String screenType, Movie movie) {
        this.screenName = screenName;
        this.screenId = screenId;
        this.screenType = screenType;
        this.movie = movie;

        seats = new Seat[5][];
        seats[0] = new Seat[10];
        seats[1] = new Seat[11];
        seats[2] = new Seat[12];
        seats[3] = new Seat[13];
        seats[4] = new Seat[14];
        String[] rowLetters = {"A", "B", "C", "D", "E"};
        SeatType[] rowTypes = {SeatType.VIP, SeatType.VIP, SeatType.Premium, SeatType.Premium, SeatType.Regular};

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat(rowTypes[i], rowLetters[i]);
            }
        }
    }

    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + "   ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Screen: ").append(screenName).append(" | ID: ").append(screenId).append(" | Type: ").append(screenType).append(" | Movie: ").append(movie).append("\n");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                stringBuilder.append(seats[i][j]).append("   ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
