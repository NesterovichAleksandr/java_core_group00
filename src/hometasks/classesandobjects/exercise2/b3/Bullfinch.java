package hometasks.classesandobjects.exercise2.b3;

import hometasks.classesandobjects.exercise2.b4.Flying;

public class Bullfinch extends ForestBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("фю-фю");
    }

    @Override
    public void fly() {
        System.out.println("Снегирь летает");
    }
}
