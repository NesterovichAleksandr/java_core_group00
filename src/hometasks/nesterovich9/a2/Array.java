package hometasks.nesterovich9.a2;

import java.util.Arrays;

public class Array<T> {
    private Object[] array;
    public int arrayLength;

    public Array(int arrayLength) {
        array = new Object[arrayLength];
        this.arrayLength = arrayLength;
    }

    public T getElement(int element) {
        T t = (T) array[element];
        return t;
    }

    public void setElement(int element, T t) {
        array[element] = t;
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                ", arrayLength=" + arrayLength +
                '}';
    }
}
