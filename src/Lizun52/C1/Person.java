package Lizun52.C1;

public abstract class Person implements PlaceForFlying {
    private String surname;
    private String name;
    private int age;

    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

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

    @Override
    public void fly() {
        System.out.println("I need one place for flying");
    }

    @Override
    public void eat(int numberSeat) {
        System.out.println("I want to eat. My number seat is " + numberSeat);
    }

    abstract void fly(int age);
}

