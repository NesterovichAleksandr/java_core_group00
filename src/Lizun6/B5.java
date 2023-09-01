package Lizun6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static hometasks.appendix.Versh.versh;

public class B5 {
    public static void main(String[] args) {

        Pattern newWord = Pattern.compile("\\b(?iu)[іуеаояию].*", Pattern.UNICODE_CHARACTER_CLASS);
        String[] arrayVersh = versh.split("\\s");

        for (String s : arrayVersh) {
            Matcher mat = newWord.matcher(s);
            while (mat.find())
                System.out.print(mat.group() + " ,  ");
        }
    }
}

