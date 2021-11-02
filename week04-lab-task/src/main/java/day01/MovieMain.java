package day01;

public class MovieMain {

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", 1997);

        movie.addActor(new Actor("Leonardo DiCaprio", 1975));
        movie.addActor(new Actor("Kate Winslet", 1978));
        movie.addActor(new Actor("Billy Zane", 1966));
        movie.addActor(new Actor("Danny Nucci", 1968));

        System.out.println("Színészek a huszas éveikben:" + movie.actorsInTheirTwenties());


    }
}
