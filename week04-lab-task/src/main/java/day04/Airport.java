package day04;

public class Airport {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("Kerep perek", "JDJD-85458", 3);
        Plane plane = new Plane(5);
        plane.addPassenger(passenger);

        System.out.println(passenger.getName());
        System.out.println(Currency.EUR.getCountriesWhereUsed());
    }
}
