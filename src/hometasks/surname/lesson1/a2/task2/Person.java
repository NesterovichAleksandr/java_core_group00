package hometasks.surname.lesson1.a2.task2;

public class Person {
    private String name;
    private int age;
    private String gender;
    public Person (String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void walk(){
        System.out.println("walks");
    } public void eat(){
        System.out.println("eats");
    } public void sleep(){
        System.out.println("sleeping");
    }

}
