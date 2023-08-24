package hometasks.getman.lesson1.b2.task2;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int numGroup;
    private int averageScore;

    public Student(String name, String surname, int age, int numGroup, int averageScore) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numGroup = numGroup;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", numGroup=" + numGroup +
                ", averageScore=" + averageScore +
                '}';
    }
}
