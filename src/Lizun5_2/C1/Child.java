package Lizun5_2.C1;

public class Child extends Person {
    public Child(String surname, String name, int age, String gender) {
        super(surname, name, age);
        this.gender = gender;
    }

    public String gender;


    @Override
    public void eat() {

    }


    void cry(String gender, int numberSeat) {
        System.out.println("The " + gender + " is scared. The number of seat is " + numberSeat);
    }

    @Override
    void fly(int age) {
        if (age < 2)
            System.out.println("I do not need a place, because my age " + age + ". I am sitting with my parents");
        else {
            System.out.println("I need a place, because my age " + age);
        }
    }
}