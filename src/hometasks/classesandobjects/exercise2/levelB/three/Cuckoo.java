package hometasks.classesandobjects.exercise2.levelB.three;

import hometasks.classesandobjects.exercise2.levelB.four.Flying;

public class Cuckoo extends ForestBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("ку-ку");
    }

    @Override
    public void fly() {
        System.out.println("Кукушка летает");
    }
}
