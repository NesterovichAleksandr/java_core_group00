package Lizun5_2.C2;

public class Run {
    public static void main(String[] args) {
        Seaweed seaCale = new Seaweed("Moss", true);
        seaCale.needOxygen();

        Ground tree = new Ground("Oak", true, "Deciduous");
        tree.needSun();

    }
}
