package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Double> stocks = new ArrayList<>();

    public double maxProfit() {
        double max = 0;
        for (int counter = 1; counter < stocks.size(); counter++) {
            for (int subCounter = counter + 1; subCounter < stocks.size(); subCounter++)
                if (stocks.get(subCounter) - stocks.get(counter) > max) {
                    max = stocks.get(subCounter) - stocks.get(counter);
                }
        }
        return max;
    }

    public Stock(List<Double> stocks) {
        this.stocks = stocks;
    }
}
