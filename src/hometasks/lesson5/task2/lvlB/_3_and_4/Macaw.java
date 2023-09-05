package hometasks.lesson5.task2.lvlB._3_and_4;

public class Macaw extends Flying implements Fly{
    @Override
    void voice() {
        System.out.println("Macaw's voice");
    }

    @Override
    public void fly() {
        System.out.println("Macaw is flying");
    }
}
