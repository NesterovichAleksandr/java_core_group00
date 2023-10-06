package Lizun9.A3;

//Создать класс NumberArray, который может хранить в себе массив только из 5 числовых типов.
//        Реализовать методы setElement и getElement которые будут сохранять и получать элементы по заданному индексу.
//        Реализовать метод printArray, который будет выводить в консоль все данные хранящиеся в этом классе.
//        Создать класс Run и в методе main создать объект класса NumberArray сохранив в него 5 чисел, выведите эти числа в консоль.
public class Run {
    public static void main(String[] args) {


        NumberArray<Integer> myArray = new NumberArray();
        myArray.setElement(0, 12);
        myArray.setElement(1, 989);
        myArray.setElement(2, 14);
        myArray.setElement(3, 25);
        myArray.setElement(4, 25);

        myArray.printArray();
    }
}