package day01;

public class Actor {
    private String actor;
    private int yearOfBirth;

    public Actor(String actor, int yearOfBirth) {
        this.actor = actor;
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }
}
