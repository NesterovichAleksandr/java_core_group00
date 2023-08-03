package Lizun52.C1;

public class Run {
    public static void main(String[] args) {
        Man person = new Man("Popov", "Ivan", 30);
        Woman person2 = new Woman("Popova", "Masha", 29);
        Child person3 = new Child("Popov", "Oleg", 12, "boy");
        Child person4 = new Child("Popova", "Ira", 1, "girl");

        System.out.println(person.getSurname() + " " + person.getName());
        person.fly();
        person.eat(52);
        System.out.println();

        person2.setName("Olga");
        System.out.println(person2.getSurname() + " " + person2.getName());
        person2.fly();
        person2.eat(53);
        System.out.println();

        System.out.println(person3.getSurname() + " " + person3.getName());
        person3.fly(12);
        person3.eat(51);
        System.out.println();

        System.out.println(person4.getSurname() + " " + person4.getName());
        person4.fly(1);
        person4.cry("Girl", 53);


    }
}
