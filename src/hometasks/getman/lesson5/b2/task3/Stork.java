package hometasks.getman.lesson5.b2.task3;

import hometasks.getman.lesson5.b2.task4.Fly;

public class Stork extends KeelBirds implements Fly {
    @Override
    public void voice() {
        System.out.println("Stork voice");
    }

    @Override
    public void fly() {
        System.out.println("The stork is flying");
    }
}
