package Lizun5_2.C2;

public class Plant {
    String name;
    boolean perennials;

    public Plant(String name, boolean perennials) {
        this.name = name;
        this.perennials = perennials;
    }

    public String getName() {
        return name;
    }

    public boolean isPerennials() {
        return perennials;
    }

    public void needOxygen() {
        System.out.println("All plans need oxygen and me too");
    }
}
