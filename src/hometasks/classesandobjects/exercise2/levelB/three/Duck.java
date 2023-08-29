package hometasks.classesandobjects.exercise2.levelB.three;

import hometasks.classesandobjects.exercise2.levelB.four.Flying;

public class Duck extends StreetBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("кря");
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }
}
