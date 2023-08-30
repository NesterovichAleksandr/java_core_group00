package hometasks.getman.lesson6.task_b5;

import hometasks.appendix.Versh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VershVowel {

    public static void main(String[] args) {
        Pattern vowel = Pattern.compile("\\s[аеёіоуыэюя][\\u0430-\\u044F\\u0451\\u0401\\u0456\\u045E]*");
        Matcher findVowel = vowel.matcher(Versh.versh.toLowerCase());
        while (findVowel.find()) {
            System.out.println(findVowel.group());
        }
    }
}
