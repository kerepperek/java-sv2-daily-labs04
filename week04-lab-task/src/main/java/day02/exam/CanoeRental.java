package day02.exam;

import java.util.ArrayList;
import java.util.List;

public class CanoeRental {
    private List<Canoe> canoes=new ArrayList<>();

    public List<Canoe> getCanoes() {
        return canoes;
    }

    public void addCanoe(Canoe canoe) {
        canoes.add(canoe);
    }

    public int getMaximumNumberOfSeats(){
        int sum=0;
        for( Canoe canoe:canoes){
            sum+=canoe.getSeats().getSeats();
        }
        return sum;
    }
}
