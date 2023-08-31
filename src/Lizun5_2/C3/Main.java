package Lizun5_2.C3;

public class Main {
    public static void main(String[] args) {

        NonFoodStore chair = new NonFoodStore("Chair", 25);
        NonFoodStore table = new NonFoodStore("Table", 50);

        FoodStore milk = new FoodStore("Milk", 3, "15/08/2023");
        FoodStore butter = new FoodStore("Butter", 2, "31/08/2023");

        chair.buy();
        table.buy();

        milk.buy();
        milk.askAboutFresh();

        butter.buy();
        butter.askAboutFresh();


    }
}