package Lizun6;

import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {
        System.out.println("Введите строку ");
        A3.whatIsIt();
    }
    public static void whatIsIt() {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.startsWith("{", 0) & !str.startsWith("{", 1)) {
            System.out.println("Вы ввели " + str + " это вектор");
        } else if (str.startsWith("{", 0) & str.startsWith("{", 1)) {
            System.out.println("Вы ввели " + str + " это матрица");
        } else {
            System.out.println(" Вы ввели " + str + " это скаляр");
        }
    }
}


