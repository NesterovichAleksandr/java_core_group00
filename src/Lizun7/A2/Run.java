package Lizun7.A2;

public class Run {
    public static void main(String[] args) {
        Parrot parrot = new Parrot() {
            void say() {
                System.out.println("А этот попугай умеет говорить!");
            }
        };
        parrot.say();
    }
}
