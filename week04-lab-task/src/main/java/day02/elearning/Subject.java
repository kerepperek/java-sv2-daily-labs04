package day02.elearning;

import java.util.List;

public class Subject {
    private String name;
    private List<Integer> marks;
    private double average;

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public double getAverage() {
        return average;
    }

    public static void main(String[] args) {
        Subject subject=new Subject();
        System.out.println(subject.getName());
        System.out.println(subject.getMarks());
        System.out.println(subject.getAverage());
    }
}
