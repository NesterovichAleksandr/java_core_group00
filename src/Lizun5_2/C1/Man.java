package Lizun5_2.C1;

public class Man extends Person {
    public Man(String surname, String name, int age) {
        super(surname, name, age);
    }

    @Override
    public void eat() {

    }
    public void fly() {
        System.out.println("I like flying");

    }
    @Override
    void fly(int age) {

    }
}
