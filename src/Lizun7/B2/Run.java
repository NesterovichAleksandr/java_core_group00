package Lizun7.B2;

public class Run {
    public static void main(String[] args) {
        Circus.Bear bear = new Circus.Bear() {
            void iCan() {
                System.out.println("Я могу рычать");
            }
        };
        Circus.Horse horse = new Circus.Horse() {
            void iCan() {
                System.out.println("Я могу возить людей");
            }
        };
        bear.iCan();
        horse.iCan();
    }
}
