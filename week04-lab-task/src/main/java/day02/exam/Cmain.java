package day02.exam;

public class Cmain {
    public static void main(String[] args) {
Canoe canoe1=new Canoe("Vizek királya", Seats.FOUR);
        Canoe canoe2=new Canoe("Vizek királya", Seats.TWO);
        Canoe canoe3=new Canoe("Vizek királya", Seats.FOUR);
        Canoe canoe4=new Canoe("Vizek királya", Seats.THREE);
        System.out.println(canoe1.getLengthInMeters());//5.32
        System.out.println(canoe2.getLengthInMeters());//3.87
        System.out.println(canoe4.getLengthInMeters());//4.56

        CanoeRental canoeRental=new CanoeRental();
        canoeRental.addCanoe(canoe1);
        canoeRental.addCanoe(canoe2);
        canoeRental.addCanoe(canoe3);
        canoeRental.addCanoe(canoe4);

        System.out.println(canoeRental.getCanoes().get(1).getName());
        System.out.println(canoeRental.getCanoes().get(3).getSeats().getNumberOfSeats());
        System.out.println(canoeRental.getMaximumNumberOfSeats());
    }
}
