package hometasks.getman.lesson5.b2.task1;

public class Main {
    public static void main(String[] args) {
       DieselCar diesel=new DieselCar();
        diesel.setView("Car");
        diesel.move();

        GasolineCar gasoline=new GasolineCar();
        gasoline.setView("Car");
        gasoline.move();

    }
}
