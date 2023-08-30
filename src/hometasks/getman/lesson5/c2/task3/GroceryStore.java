package hometasks.getman.lesson5.c2.task3;

public class GroceryStore extends Shop{

    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void sales() {
        System.out.println("Sales plan");
    }

    @Override
    public void purchases() {
        System.out.println("Purchases plan");
    }

    @Override
    public String toString() {
        return super.toString()+", specialization-"+getSpecialization();
    }
}
