package Lizun6.C3;


import static Lizun6.C3.Run.fast;
import static Lizun6.C3.Run.slow;
import static hometasks.appendix.Versh.versh;

public class Main {
    public static void main(String[] args) {
        long beginner = System.currentTimeMillis();
        slow(versh);
        long concat = System.currentTimeMillis();

        long beginner2 = System.currentTimeMillis();
        fast(versh);
        long strBuild = System.currentTimeMillis();

        System.out.println("Время выполнения при работе метода slow: " + (concat - beginner) + " миллисекунд");
        System.out.println("Время выполнения при работе метода fast: " + (strBuild - beginner2) + " миллисекунд");


    }

}