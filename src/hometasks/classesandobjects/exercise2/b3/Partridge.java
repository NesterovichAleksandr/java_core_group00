package hometasks.classesandobjects.exercise2.b3;

import hometasks.classesandobjects.exercise2.b4.Flying;

public class Partridge extends ForestBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("xo-xo");
    }

    @Override
    public void fly() {
        System.out.println("Куропатка летает");
    }
}
