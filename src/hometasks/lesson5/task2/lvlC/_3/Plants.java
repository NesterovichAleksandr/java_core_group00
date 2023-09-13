package hometasks.lesson5.task2.lvlC._3;

public abstract class Plants {
    public abstract void grow(boolean sun, boolean water);

    public void plant(int numberOfPlants) {
        System.out.println("You planted " + numberOfPlants + " plants");
    }

    public void plant() {
        System.out.println("You planted a plant");
    }
}
