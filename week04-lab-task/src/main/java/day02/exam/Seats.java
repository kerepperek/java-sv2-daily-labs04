package day02.exam;

public enum Seats {
    TWO(2,3.87),THREE(3,4.56),

    FOUR(4,5.32);

    private int seats;
    private double lengthInMeters;

    public int getSeats() {
        return seats;
    }

    Seats(int seats, double canoeLength) {
        this.seats = seats;
        this.lengthInMeters = canoeLength;
        ;
    }

    public double getLengthInMeters() {
        return lengthInMeters;
    }
    public int getNumberOfSeats(){
        return seats;
    }


}
