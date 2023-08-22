package hometasks.getman.lesson2.task_b4;

import hometasks.getman.lesson2.task_a3.Regex;
import hometasks.getman.util.Util;

import java.util.regex.Pattern;

public class MobileOperator {

    public final static String REGEX_NUM_PHONE = "((\\+375)[- ]?)(\\(?\\d{2}\\)?[- ]?)?[\\d- ]{7}";
    public final static String REGEX_NUM_fPHONE = "((8|\\+7|\\+375)[\\- ]?)(\\(?\\d{1,3}\\)?[\\- ]?)?[\\d\\- ]{7,10}";


    public static void main(String[] args) {

           /* String filePath = "D:\\Movies\\Futurama.mp4";
            int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
            String fileName = filePath.substring(lastFileSeparatorIndex + 1);
            System.out.println(fileName); //9*/

        String number= Util.scannerString();
        Pattern numberPhone = Pattern.compile(REGEX_NUM_PHONE);
        String prefix;
        String firstNumber;
        if (numberPhone.matcher(number).matches()) {
            prefix=number.substring(4,6);
            System.out.println(prefix);






            System.out.println("This is phone number - " + number);
        }else {
            System.out.println("Incorrect phone number - " + number);
        }



    }
}
