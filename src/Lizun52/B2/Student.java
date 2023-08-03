package Lizun52.B2;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int group;
    private double averageMark;

    public Student(String name, String surname, int age, int group, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.averageMark = averageMark;
    }
    public void printAboutStudent () {
        System.out.println("Student " + surname + " " + name + ", age is " + age
        + ", group number " + group + ", averageMark is " + averageMark);
    }
}
