package Lizun9.A3;

import java.util.Arrays;

public class NumberArray {

    Number[] myArray = new Number[5];

    public Number getElement(int element) {
        System.out.println(myArray[element]); // для чистоты кода этой строчки здесь не должно быть
        return myArray[element];
    }

    public void setElement(int element, Number el) {
        myArray[element] = el;
    }

    public void printArray() {
        System.out.println(Arrays.toString(myArray));
    }
}
