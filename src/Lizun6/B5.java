package Lizun6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static hometasks.appendix.Versh.versh;

public class B5 {
    public static void main(String[] args) {

        Pattern newWord = Pattern.compile("\\b(?iu)[іуеаояию].*");
        String[] arrayVersh = versh.split("\\s");

        for (String s : arrayVersh) {
            Matcher mat = newWord.matcher(s);
            while (mat.find()) // это условие всегда false, поэтому в консоль ничего не выводится.
                System.out.println(mat.group());
        }
    }
}
/*
мне всегда выводит:
i
I
iржышчы
I

 */