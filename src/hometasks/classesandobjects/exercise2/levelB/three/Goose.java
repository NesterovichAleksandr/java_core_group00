package hometasks.classesandobjects.exercise2.levelB.three;

import hometasks.classesandobjects.exercise2.levelB.four.Flying;

public class Goose extends HomeBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("га-га");
    }

    @Override
    public void fly() {
        System.out.println("Гусь летает");
    }
}
