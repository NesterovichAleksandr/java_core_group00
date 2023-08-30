package hometasks.getman.lesson5.c2.task1;


public class Worker extends Person {

    private int insurancePolicyNumber;


    public int getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(int insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }


    public void work() {
        System.out.println("Working");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public String toString() {
        return "Name-" + getName() + ", age-" + getAge() + ", num of policy-" + getInsurancePolicyNumber();
    }
}
