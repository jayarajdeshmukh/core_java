package classComponents.Constructor;

public class Movie {
    int id;
    String title;
    String genre;
    int year;
    String director;
    int rating;

    // zero parameterized constructor
    public Movie(){
        System.out.println("Zero param constructor");
        id = 1;
        title = "Soldier";
        genre = "action";
        year = 2000;
        director= "Jay";
        rating = 10;

    }


    public static void main(String[] args){
        Movie movie1 = new Movie(); // call to zero param constructor
        Movie movie2 = new Movie();
    }
}
