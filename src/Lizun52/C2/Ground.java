package Lizun52.C2;

public class Ground extends Plant {


    String kind;

    public Ground(String name, boolean perennials, String kind) {
        super(name, perennials);
        this.kind = kind;
    }

    public void needSun ()
    {
        System.out.println("I need a sun for my green crown");
    }
}
