package hometasks.getman.lesson1.c2.task3;

public class FishStore extends GroceryStore {

    @Override
    public void sales() {
        super.sales();
        System.out.println("Add discount");
    }

    @Override
    public void purchases() {
        super.purchases();
    }

    public void maintenanceOfFreezingEquipment() {
        System.out.println("Maintenance of freezing equipment");
    }


}
