package hometasks.getman.lesson6.task_b3;

import hometasks.getman.util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowel {
    public static void main(String[] args) {
        Vowel.vowel(Util.scannerString());
    }

    public static void vowel(String text) {
        int count = 0;
        Pattern vowel = Pattern.compile("[aeiouy]|[аоэеиыуёюя]");
        Matcher findVowel = vowel.matcher(text.toLowerCase());
        while (findVowel.find()) {
            count++;
        }
        System.out.println("The number of vowels in the text - " + count);
    }
}
