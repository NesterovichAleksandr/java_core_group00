package Lizun9.A3;

import java.util.Arrays;

public class NumberArray<T> {
    Integer[] myArray = new Integer[5];

    public void getElement(int element) {
        final T el = (T) myArray[element];
        System.out.println(el);
    }

    public void setElement(int element, int el) {
        myArray[element] = el;
    }

    public void printArray() {
        System.out.println(Arrays.toString(myArray));
    }
}
