package hometasks.classesandobjects.exercise2.levelB.three;

import hometasks.classesandobjects.exercise2.levelB.four.Flying;

public class Crow extends StreetBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("кар");
    }

    @Override
    public void fly() {
        System.out.println("ворона летает");
    }
}
