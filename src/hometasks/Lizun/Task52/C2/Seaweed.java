package TaskPlant;

public class Seaweed extends Plant{
    public Seaweed(String name, boolean perennials) {
        super(name, perennials);

    }
     public void needOxygen()
    {
        System.out.println("I need oxygen now");
    }
}
