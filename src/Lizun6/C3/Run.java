package Lizun6.C3;

import java.util.Random;

public class Run {
    public static String slow(String str) {
        String[] versh2 = str.split(" ");
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int num = random.nextInt(versh2.length);
            str = str.concat(versh2[num] + " \n");
        }
        System.out.println(str);
        return str;
    }

    public static String fast(String str2) {
        StringBuilder stringBuilder = new StringBuilder(str2);
        String[] versh = str2.split(" ");
        Random random = new Random();
        int num;
        for (int i = 0; i < 10000; i++) {
            num = random.nextInt(versh.length);
            stringBuilder.append(versh[num]).append(" \n");
        }
        System.out.println(stringBuilder);
        return str2;
    }

}

