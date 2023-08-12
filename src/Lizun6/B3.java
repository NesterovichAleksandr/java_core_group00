package Lizun6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B3 {
    public static void main(String[] args) {
        System.out.println("Введите предложение ");
        B3.countVowel();
    }
    static void countVowel() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Pattern vowel = Pattern.compile("(?iu)[аеёиоуыэюяeyuioa]");

        Matcher m = vowel.matcher(text);
        int vowelCounter = 0;
        while (m.find()) {
            vowelCounter++;
        }
        System.out.println("В вашем предложении " + vowelCounter + " гласных ");
    }
}
