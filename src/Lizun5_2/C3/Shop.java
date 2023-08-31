package Lizun5_2.C3;

public class Shop {
    String name;
    int price;

    public Shop(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void buy() {
        System.out.println("I will buy this product " + getName());
    }

}
