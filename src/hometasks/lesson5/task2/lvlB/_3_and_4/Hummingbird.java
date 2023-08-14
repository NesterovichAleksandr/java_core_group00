package hometasks.lesson5.task2.lvlB._3_and_4;

public class Hummingbird extends Flying implements Fly {
    @Override
    void voice() {
        System.out.println("Hummingbird's voice");
    }

    @Override
    public void fly() {
        System.out.println("Hummingbird is flying");
    }
}
