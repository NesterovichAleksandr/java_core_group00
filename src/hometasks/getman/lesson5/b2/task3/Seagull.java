package hometasks.getman.lesson5.b2.task3;

import hometasks.getman.lesson5.b2.task4.Fly;

public class Seagull extends KeelBirds implements Fly {
    @Override
    public void voice() {
        System.out.println("Seagull voice");
    }

    @Override
    public void fly() {
        System.out.println("The seagull is flying");
    }
}
