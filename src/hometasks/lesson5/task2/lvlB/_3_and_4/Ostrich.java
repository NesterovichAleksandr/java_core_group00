package hometasks.lesson5.task2.lvlB._3_and_4;

public class Ostrich extends NotFlying implements Run{
    @Override
    void voice() {
        System.out.println("Ostrich's voice");
    }

    @Override
    public void run() {
        System.out.println("Ostrich is running");
    }
}
