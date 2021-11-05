package day02.elearning;

public class School {
    private Student student;
    private boolean isStudentActive;
    private Subject subject;

    public Student getStudent() {
        return student;
    }

    public boolean isStudentActive() {
        return isStudentActive;
    }

    public Subject getSubject() {
        return subject;
    }

    public static void main(String[] args) {
        School school=new School();
        System.out.println(school.getStudent());
        System.out.println(school.isStudentActive());
        System.out.println(school.getSubject());
    }
}
