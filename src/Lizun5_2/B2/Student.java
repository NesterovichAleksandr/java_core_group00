package Lizun5_2.B2;

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

    //Создайте метод, который будет выводить в консоль всю информацию о студенте.
    // студент - это класс. для вывода информации о классе есть стандартный метод toString.
    // поэтому корректнее было бы переопределить метод toString, а не создавать printAboutStudent
    public String toString() {
        System.out.println("Student " + surname + " " + name + ", age is " + age
                + ", group number " + group + ", averageMark is " + averageMark);
        return null;
    }
}
