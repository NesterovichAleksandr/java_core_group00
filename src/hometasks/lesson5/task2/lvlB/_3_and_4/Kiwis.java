package hometasks.lesson5.task2.lvlB._3_and_4;

public class Kiwis extends NotFlying implements Run {
    @Override
    void voice() {
        System.out.println("Kiwis' voice");
    }

    @Override
    public void run() {
        System.out.println("Kiwis is running");
    }
}
