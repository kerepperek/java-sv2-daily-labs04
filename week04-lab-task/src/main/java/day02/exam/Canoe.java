package day02.exam;

public class Canoe {
    private String name;
    private Seats seats;
    private double lengthInMeters;


    public Canoe(String name, Seats seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public Seats getSeats() {
        return seats;
    }

    public double getLengthInMeters() {
        return seats.getLengthInMeters();
    }
}
