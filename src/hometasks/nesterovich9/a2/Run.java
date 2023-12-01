package hometasks.nesterovich9.a2;

public class Run {
    public static void main(String[] args) {
        final int length = 5;
        Array<Integer> integerArray = new Array(length);
        for (int i = 0; i < length; i++) {
            integerArray.setElement(1, 2);
            System.out.println(integerArray);
        }

        Array<String> stringArray = new Array(length);
        for (int i = 0; i < length; i++) {
            stringArray.setElement(2, "two");
            System.out.println(stringArray);
        }
    }
}
/*Создать класс Array, который может хранить в себе массив из 5 любых
объектов. Реализовать методы setElement и getElement которые
будут сохранять и получать элементы по заданному индексу. В классе
Run проверить работу класса Array на объектах разного типа.*/