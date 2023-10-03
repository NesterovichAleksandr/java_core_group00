package Lizun10.A2;

import java.util.ArrayList;

public class Klass {

    public static void main(String[] args) {


        ArrayList<Student> allClass = new ArrayList<>();
        Student student1 = new Student("Ivanov Pavel", 15);
        Student student2 = new Student("Petrova Masha", 16);
        allClass.add(student1);
        allClass.add(student2);

        System.out.println(allClass);
    }
}
