package Lizun52.C3;

public class FoodStore extends Shop {

    String expiration;


    public FoodStore(String name, int price, String expiration) {
        super(name, price);
        this.expiration = expiration;
    }

    @Override
    void buy() {
        super.buy();
    }

    void askAboutFresh() {
        System.out.println("This product " + getName() + " is fresh ? \n Yes, Its expiration date " + expiration);
    }
}
