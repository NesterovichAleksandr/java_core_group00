package hometasks.classesandobjects.exercise2.b3;

import hometasks.classesandobjects.exercise2.b4.Flying;

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
