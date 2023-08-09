package hometasks.Getman.lesson1.c2.task1;

public class Main {
    public static void main(String[] args) {
        Worker engineer = new Engineer();
        engineer.setName("Bob");
        engineer.setAge(25);
        engineer.setInsurancePolicyNumber(1564146846);
        System.out.println(engineer);
        engineer.work();
    }
}
