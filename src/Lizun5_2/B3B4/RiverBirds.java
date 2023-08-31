package Lizun5_2.B3B4;

public class RiverBirds extends NearWater implements Swimming {
    public void voice() {
        System.out.println("кря-кря-кря");
    }

    @Override
    public void swim() {
        System.out.println("I dive in the river for prey");
    }
}
