package hometasks.classesandobjects.exercise2.levelC.one;

public class YoungPerson extends Person {
    @Override
    public void walk() {
        super.walk(); // эта строчка не обязательна.
        System.out.println("Walking fast");
    }
}
