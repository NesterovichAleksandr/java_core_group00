package Lizun6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B3 {
    public static void main(String[] args) {

        System.out.println(countVowel("I love Java.  And I will learn it. Я люблю Джава...") + " гласных в предложении");
    }

    public static int countVowel(String word) {
        Pattern vowel = Pattern.compile("(?iu)[аеёиоуыэюяeyuioa]");
        Matcher m = vowel.matcher(word);
        int vowelCounter = 0;
        while (m.find()) {
            vowelCounter++;
        }
        return vowelCounter;
    }
}
