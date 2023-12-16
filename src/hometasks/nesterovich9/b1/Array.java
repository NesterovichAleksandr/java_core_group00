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

    public void printArray() {
        System.out.println("array = " + Arrays.toString(array));
    }
}