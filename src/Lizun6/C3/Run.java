package Lizun6.C3;

import java.util.Random;

import static hometasks.appendix.Versh.versh;

public class Run {

    static String[] versh2 = formText();
    private static String str2;
    private static String str;

    public static String[] formText() {
        String text = versh.replaceAll("\n", " ");
        return text.split(" ");
    }

    public static void slow(String str) {
        Run.str = str;
        formText();
        Random random = new Random(5);
        for (int i = 0; i < 10000; i++) {
            int num = random.nextInt(versh2.length);
            str = str.concat(versh2[num] + ", ");
        }
        System.out.println(str);
    }

    public static void fast(String str2) {
        Run.str2 = str2;
        formText();
        StringBuilder stringBuilder = new StringBuilder(str2);
        Random random = new Random(5);
        int num;
        for (int i = 0; i < 10000; i++) {
            num = random.nextInt(versh2.length);
            stringBuilder.append(versh2[num]).append(", ");
        }
        System.out.println(stringBuilder);
    }

    public static void equalsStr() {
        System.out.println(str.equals(str2));
    }
}
