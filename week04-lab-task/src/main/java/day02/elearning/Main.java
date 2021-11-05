package day02.elearning;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Nyolcas számrendszer
        LocalDate date=LocalDate.of(2021,03,012);
        System.out.println(date);

        if (6 == 3 * 2 || 5 * 6 == 30) {
            System.out.print(true);
        }
        if (3 > 2 || 6 > 7) {
            System.out.print(true);
        }
        if (false || true) {
            System.out.print(true);
        }
        if ("alma".contains("ö")) {
            System.out.print(true);
        }
        if (6 == 3 * 2 || 5 * 6 == 30) {
            System.out.print(true);
        }
        if (6 == 3 * 2 || 5 * 6 == 30) {
            System.out.print(true);
        }

        System.out.println(1 + 2 + "3" + 4 + 5);
        System.out.println(1 + 2 + "".concat("3") + 4 + 5);
        System.out.println(1 + 2 + "3".concat("4").concat("5"));
        System.out.println(1 + "2" + "".concat("") + 3 + 4 + 5);
    }
}
