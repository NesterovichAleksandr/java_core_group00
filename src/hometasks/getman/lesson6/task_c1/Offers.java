package hometasks.getman.lesson6.task_c1;

import hometasks.appendix.Versh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Offers {

    //Я понимаю, что тема строки и регулярки. Можно просто отсортировать массив.
    //Просто мне захотелось лямбды потренить.


    public Offers() {
            }

    public List<String> stringToList(String text) {
        // загугли что называют предложением. на какие знаки препинания оно заканчивается?)
        return Arrays.asList(text.split("\\n"));
    }

    public List<String> sortList(List<String>textOffers) {
        return textOffers.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
    }

    public void printSortList(List<String>textOffers) {
        for (String offer : textOffers) {
            System.out.println(offer);
        }
    }

    public static void main(String[] args) {
        Offers offers1 = new Offers();
        offers1.printSortList(offers1.sortList(offers1.stringToList(Versh.versh)));
    }
}
