package TaskPlant;

public class Run {
    public static void main(String[] args) {
        Seaweed seaCale = new Seaweed("Moss", true);
        seaCale.needOxygen();

        Ground tree = new Ground("Oak", true, "Deciduous");
        tree.needSun();

    }
}
