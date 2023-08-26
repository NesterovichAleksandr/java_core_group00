package hometasks.getman.lesson5.c2.task3;

public class Main {
    public static void main(String[] args) {
        GroceryStore fish=new FishStore();
        fish.setAddress("http://localhost");
        fish.setName("fish");
        fish.setSpecialization("fish store");
        fish.setId(123);
        System.out.println(fish.toString());
        fish.sales();
    }
}
