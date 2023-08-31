package Lizun5_2.C1;

public class Woman extends Person {


    public Woman(String surname, String name, int age) {
        super(surname, name, age);
    }

    public void fly() {
        super.fly();
    }

    @Override
    void fly(int age) {

    }

    @Override
    public void eat() {
    }


}
