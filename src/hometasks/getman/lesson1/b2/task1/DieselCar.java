package hometasks.getman.lesson1.b2.task1;

public class DieselCar extends Vehicle {
    private String type = "Diesel";


    public void move() {
        System.out.println(type+" " + Vehicle.getView() + " move");

    }
}