package Lizun6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B3 {
    public static void main(String[] args) {
        System.out.println("Введите предложение ");
        B3.countVowel();
    }

    // выполнить условие задачи: Написать метод, который на вход принимает строку
    static void countVowel() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Pattern vowel = Pattern.compile("(?iu)[аеёиоуыэюяeyuioa]");
        // а вот тут хорошо что и английские гласные учтены) я про это даже не подумал)) после устранения замечания этот коммент можно удалить)

        Matcher m = vowel.matcher(text);
        int vowelCounter = 0;
        while (m.find()) {
            vowelCounter++;
        }
        System.out.println("В вашем предложении " + vowelCounter + " гласных ");
    }
    //задача: а на выходе говорит сколько там гласных.
    //я хотел увидеть метод, который возвратит число гласных. а в main уже вывести это число. как лучше тогда задание переформулировать?
}
