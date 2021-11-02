package day01;

public class MovieMain {

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", 1997);

        movie.addActor(new Actor("Dicaprio", 1968));
        movie.addActor(new Actor("Dicaprio", 1978));
        System.out.println("Színészek a huszas éveikben:" + movie.actorsInTheirTwenties());


    }
}
