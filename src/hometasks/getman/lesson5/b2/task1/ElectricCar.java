package hometasks.getman.lesson5.b2.task1;

public class ElectricCar extends Vehicle{
    private String type = "Electric";


    public void move() {
        System.out.println(type+" " + getView() + " move");

    }
}
