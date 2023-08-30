package hometasks.classesandobjects.exercise2.levelB.three;

import hometasks.classesandobjects.exercise2.levelB.four.Flying;

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
