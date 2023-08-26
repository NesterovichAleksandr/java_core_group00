package hometasks.getman.lesson6.task_c1;

import hometasks.appendix.Versh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Offers {
    private String versh;
    private List<String> offers;


    public Offers(String versh) {
        this.versh = versh;
    }

    public void stringToList() {
        offers = Arrays.asList(versh.split("\\n"));
    }

    public void sortList() {
        offers = offers.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
    }

    public void printSortList() {
        for (String offer : offers) {
            System.out.println(offer);
        }
    }

    public static void main(String[] args) {
        Offers offers1 = new Offers(Versh.versh);
        offers1.stringToList();
        offers1.sortList();
        offers1.printSortList();
    }
}
