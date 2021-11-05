package day02.elearning;

public class Student {

    private String name;
    private int age;
    private char letterOfClass;

    public String getName(){return name;}
    public int getAge(){return age;}
    public char getLetterOfClass(){
        return letterOfClass;
    }

    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getLetterOfClass());
        System.out.println(student);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", letterOfClass=" + letterOfClass +
                '}';
    }
}
