package Lizun52.B3B4;

public class SeaBirds extends NearWater implements Swimming {
    public void voice() {
        System.out.println("нга-нга-нга");
    }

    @Override
    public void swim() {
        System.out.println("Sometimes I can dive in the water for fish");
    }
}
