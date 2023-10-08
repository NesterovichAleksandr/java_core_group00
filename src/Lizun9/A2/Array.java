package Lizun9.A2;

import java.util.Arrays;

public class Array<T> {
    Object[] myArray = new Object[5];

    public void getElement(int element) {
        final T el = (T) myArray[element];
    }

    public void setElement(int element, T el) {
        myArray[element] = el;
    }

    public String toString() {
        return Arrays.toString(myArray);
    }
}
