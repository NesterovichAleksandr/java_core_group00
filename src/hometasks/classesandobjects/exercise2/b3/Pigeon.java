package hometasks.classesandobjects.exercise2.b3;

import hometasks.classesandobjects.exercise2.b4.Flying;

public class Pigeon extends StreetBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("ур-ур");
    }

    @Override
    public void fly() {
        System.out.println("Голубь летает");
    }
}
