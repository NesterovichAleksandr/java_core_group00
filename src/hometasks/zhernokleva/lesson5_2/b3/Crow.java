package hometasks.zhernokleva.lesson5_2.b3;

import hometasks.zhernokleva.lesson5_2.b4.Flying;

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
