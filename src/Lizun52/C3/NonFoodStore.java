package Lizun52.C3;

public class NonFoodStore extends Shop {
    public NonFoodStore(String name, int price) {
        super(name, price);
    }

    @Override
  void buy() {
        System.out.println("I will buy this product " + getName() + " for " + getPrice() + " euros");
    }
}
