package hometasks.surname.lesson1.a2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    static Map<Integer, String> group = new HashMap<>();

    public static void main(String[] args) {
        initGroup();
        int size = 8;
        Scanner scanner = new Scanner(System.in);
        while (!group.isEmpty()) {
            scanner.next();
            int number = getNumber(size);
            while (group.get(number) == null) {
                number = getNumber(size);
            }
            System.out.println(group.get(number));
            group.remove(number);
        }
    }

    static void initGroup() {
        group.put(1, "Максим");
        group.put(2, "Юрий");
        group.put(3, "Анна Д");
        group.put(4, "Анна Ж");
        group.put(5, "Владислав");
        group.put(6, "Наталья");
        group.put(7, "Евгений");
        group.put(8, "Владимир");
    }

    static int getNumber(int size) {
        Random random = new Random();
        return random.nextInt(size) + 1;
    }
}
