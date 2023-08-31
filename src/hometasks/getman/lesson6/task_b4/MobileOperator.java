package hometasks.getman.lesson6.task_b4;

import hometasks.getman.util.Util;

import java.util.regex.Pattern;

public class MobileOperator {

    public final static String REGEX_NUM_PHONE = "((\\+375)[- ]?)(\\(?\\d{2}\\)?[- ]?)?[\\d- ]{7}";
    public final static String REGEX_NUM_fPHONE = "((8|\\+7|\\+375)[\\- ]?)(\\(?\\d{1,3}\\)?[\\- ]?)?[\\d\\- ]{7,10}";


    public static void main(String[] args) {


        String number = Util.scannerString();
        Pattern numberPhone = Pattern.compile(REGEX_NUM_PHONE);
        String prefix;
        String firstNumber;
        if (numberPhone.matcher(number).matches()) {
            prefix = number.substring(4, 6);
            firstNumber = number.substring(6, 7);
            if (prefix.equals(OperatorsOfBelarus.LIFE.getPrefix())) {
                System.out.println("This is " + OperatorsOfBelarus.LIFE.getNameOfOperator());
            } else if (prefix.equals(OperatorsOfBelarus.MTS.getPrefix())) {
                System.out.println("This is " + OperatorsOfBelarus.MTS.getNameOfOperator());

            } else if (prefix.equals(OperatorsOfBelarus.VELCOM_A1.getPrefix())) {
                System.out.println("This is " + OperatorsOfBelarus.VELCOM_A1.getNameOfOperator());
            } else if (prefix.equals(OperatorsOfBelarus.VELCOM_A1.getPrefix2())) {
                if (firstNumber.equals("6") || firstNumber.equals("3") || firstNumber.equals("1")) {
                    // а вот за создание третьего вложенного if по пальцам нужно бить! через пол года ты сам будешь плеваться читая такой код)
                    System.out.println("This is " + OperatorsOfBelarus.VELCOM_A1.getNameOfOperator());
                } else if (firstNumber.equals("7") || firstNumber.equals("8") || firstNumber.equals("5")) {
                    System.out.println("This is " + OperatorsOfBelarus.MTS.getNameOfOperator());

                } else {
                    System.out.println("Incorrect phone number");
                }
            } else {
                System.out.println("Incorrect number of operator");
            }
        } else {
            System.out.println("Incorrect phone number - " + number);

        }


    }
}
