package hometasks.lesson5.task2.lvlC._1;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("My name is " + name + '\n' + "I am " + age + " years old");
    }
}
