package hometasks.velimovich.les5.les5_2.b2;

public class b2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", "20", "Группа 1", "4.5");

        Student student2 = new Student("Петр", "Петров", "21", "Группа 2", "4.0");

        System.out.println("Информация о первом студенте:");
        student1.printInfo();

        System.out.println("Информация о втором студенте:");
        student2.printInfo();
    }
        static class Student {
            String name;
            String surname;
            String age;
            String group;
            String gpa;
            public Student (String name, String surname, String age, String group, String gpa) {
                this.name = name;
                this.surname = surname;
                this.age = age;
                this.group = group;
                this.gpa = gpa;}
            public void printInfo(){
                System.out.println("Name: " + name);
                System.out.println("Surname: " + surname);
                System.out.println("Age: " + age);
                System.out.println("Group: " + group);
                System.out.println("GPA: " + gpa);

        }
    }
}


