package Lizun5_2.B3B4;

public class Run {
    public static void main(String[] args) {
        RiverBirds duck = new RiverBirds();
        SeaBirds seagull = new SeaBirds();
        WadingBirds heron = new WadingBirds();

        DecorativeBirds parrot = new DecorativeBirds();
        HouseHoldBirds turkey = new HouseHoldBirds();
        SingingBirds nightingale = new SingingBirds();

        AllEatingBirds crow = new AllEatingBirds();
        MeatEatingBirds eagle = new MeatEatingBirds();
        PlantEatingBirds grouse = new PlantEatingBirds();


        duck.voice();
        seagull.voice();
        heron.voice();

        parrot.voice();
        turkey.voice();
        nightingale.voice();

        crow.voice();
        eagle.voice();
        grouse.voice();

        seagull.swim();
        duck.swim();

    }
}
