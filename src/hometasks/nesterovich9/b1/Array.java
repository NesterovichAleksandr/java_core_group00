package hometasks.nesterovich9.b1;

import java.util.Arrays;

public class Array<T> {
    Object[] array = new Object[10];

    public void setElement(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                break;
            }
        }
    }

    public void getElement(int index) {
        System.out.println("Индексу " + index + " соответствует элемент " + array[index]);
    }

    public void contains(Object element) {
        String contain = "Такой элемент НЕ содержится в массиве";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                contain = "Такой элемент содержится в массиве";
            }
        }
        System.out.println(contain);
    }

    public void getIndex(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Элемент " + element + " соответствует индексу " + i);
            }
        }
    }

    @Override
    public String toString() {
        return "array = " + Arrays.toString(array);
    }
}
/*1.Создать обобщённый класс Array, который хранит в себе массив
объектов в количестве 10 шт по умолчанию. Реализовать метод
setElement, который будет сохранять в первую свободную ячейку
элемент. Реализовать метод getElement, который будет выводить
элемент по заданному индексу. Реализовать метод contains, который
будет проверять содержится ли уже такой элемент в массиве.
Реализовать метод getIndex, который на входе будет принимать
элемент, а на выходе индекс этого элемента в массиве. Создать класс
Run и в методе main проверить работу каждого метода.*/