package hometasks.lesson5.task2.lvlB._3_and_4;

public class Pigeon extends Flying implements Fly{
    @Override
    void voice() {
        System.out.println("Pigeon's voice");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }
}
