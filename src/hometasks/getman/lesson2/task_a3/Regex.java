package hometasks.getman.lesson2.task_a3;

import hometasks.getman.util.Util;

import java.util.regex.Pattern;

public class Regex {
    public final static String REGEX_NUM_PHONE = "((8|\\+7|\\+375)[- ]?)(\\(?\\d{1,3}\\)?[- ]?)?[\\d- ]{7,10}";
    public final static String REGEX_EMAIL = "[A-Za-z0-9+_.-]{3,}+@(\\w+\\.+\\w{1,3})";
    public final static String REGEX_DATE = "(0[1-9]|[1-2][0-9]|3[0-1])[- /.](0[1-9]|1[1-2])[- /.](19|20)\\d\\d";

    public static void main(String[] args) {
        Regex.regex(Util.scannerString());
    }

    public static void regex(String text) {
        Pattern numberPhone = Pattern.compile(REGEX_NUM_PHONE);
        Pattern email = Pattern.compile(REGEX_EMAIL);
        Pattern date = Pattern.compile(REGEX_DATE);

        if (numberPhone.matcher(text).matches()) {
            System.out.println("This is phone number - " + text);
        } else if (email.matcher(text).matches()) {
            System.out.println("This is email - " + text);
        } else if (date.matcher(text).matches()) {
            System.out.println("This is date - " + text);
        } else {
            System.out.println("error");
        }

    }
}
