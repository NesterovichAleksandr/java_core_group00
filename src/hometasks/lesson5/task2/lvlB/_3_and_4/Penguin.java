package hometasks.lesson5.task2.lvlB._3_and_4;

public class Penguin extends NotFlying implements Slide{
    @Override
    void voice() {
        System.out.println("Penguin's voice");
    }

    @Override
    public void slide() {
        System.out.println("Penguin is sliding");
    }
}
