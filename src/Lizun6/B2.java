package Lizun6;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        System.out.println("Введите предложение ");
        B2.countWord();
    }
    static void countWord() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        System.out.print("В вашем предложении " + words.length + " слов.");
    }
}

