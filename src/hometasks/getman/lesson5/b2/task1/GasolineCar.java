package hometasks.getman.lesson5.b2.task1;

public class GasolineCar extends Vehicle {
    private String type = "Gasoline";


    public void move() {
        System.out.println(type+" " + Vehicle.getView() + " move");

    }

}
