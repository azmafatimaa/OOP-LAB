public class Seat {
    SeatType seatType;
    String row;
    String seatId;
    boolean isAvailable=true;

    static int counter=1;
    public Seat(SeatType type, String row ){
        seatId =row+counter++;
        this.seatType=type;
        this.row=row;

    }

    public String toString() {
        return String.format("%s %s %s %.2f %b", seatId, seatType, row , seatType.price , isAvailable);
    }



    public String getSeatId() {
        return seatId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getRow() {
        return row;
    }

    public void bookSeat() {
        isAvailable = false;
    }


}


enum SeatType{
    VIP(20) , Premium(15) , Regular(10);
    double price;
    SeatType(double price){
        this.price=price;
    }
}
