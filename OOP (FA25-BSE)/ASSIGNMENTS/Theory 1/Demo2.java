public class Demo2 {
public static void main(String[] args){
    Movie[] movies = {
            new Movie("Avengers", "Action", 180, "3:00 PM"),
            new Movie("Frozen", "Animation", 120, "12:00 PM"),
            new Movie("Inception", "Sci-Fi", 150, "6:00 PM")
    };

CityCinema cityCinema=new CityCinema("Lahore Emporium" ,  6 , "Lahore", movies);
    System.out.println(cityCinema);

}
}
