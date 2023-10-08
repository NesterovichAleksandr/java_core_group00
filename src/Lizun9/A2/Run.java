package Lizun9.A2;
//Создать класс Array, который может хранить в себе массив из 5 любых объектов.
//        Реализовать методы setElement и getElement которые будут сохранять и
//        получать элементы по заданному индексу.
//        В классе Run  проверить работу класса Array на объектах разного типа.

public class Run {
    public static void main(String[] args) {
        Array<Object> myArray = new Array();
        myArray.setElement(0, 12);
        myArray.getElement(0);

        myArray.setElement(1, "java");
        myArray.getElement(1);

        myArray.setElement(2, 'A');
        myArray.getElement(2);

        myArray.setElement(3, 25.2222);
        myArray.getElement(3);

        myArray.setElement(4, true);
        myArray.getElement(4);

        System.out.println(myArray);
    }
}
