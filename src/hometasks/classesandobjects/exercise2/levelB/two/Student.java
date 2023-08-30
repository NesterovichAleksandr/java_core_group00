package hometasks.classesandobjects.exercise2.levelB.two;

public class Student {
    String name;
    String surname;
    int age;
    int group;
    int averageMark;

    public Student(String name, String surname, int age, int group, int averageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void printInformation() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}');
    }
}
//Создайте класс Student с полями: имя, фамилия, возраст, группа,
//средний балл. Создайте конструктор для заполнения всех полей
//класса. Создайте метод, который будет выводить в консоль всю
//информацию о студенте. Продемонстрируйте работу этого метода
//на двух объектах класса Student.
