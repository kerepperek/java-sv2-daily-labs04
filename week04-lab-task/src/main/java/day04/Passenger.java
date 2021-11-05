package day04;

public class Passenger {
    private String name;
    private String tickedId;
    private double packageQty;

    public Passenger(String name, String tickedId, double packageQty) {
        this.name = name;
        this.tickedId = tickedId;
        this.packageQty = packageQty;
    }

    public String getName() {
        return name;
    }

    public String getTickedId() {
        return tickedId;
    }

    public double getPackageQty() {
        return packageQty;
    }

    public void setName(String name) {
        this.name = name;
    }
}
