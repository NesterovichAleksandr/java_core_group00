package Lizun9.В1;

import java.util.Arrays;

public class Array {
    Object[] myArray = new Object[10];

    public void setElement(Object element) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                myArray[i] = element;
                break;
            }
        }
    }

    public Object getElement(int i) {
        System.out.println("Элемент " + myArray[i] + "; под индексом " + i);
        return myArray[i];
    }

    public void contains(Object element) {
        for (int i = 0; i < myArray.length; i++) {
            if (element.equals(myArray[i])) {
                break;
            }
        }
        System.out.println("Элемент " + element + " есть в массиве. ");
    }


    public Object getIndex(Object element) {
        for (int i = 0; i < myArray.length; i++) {
            if (element.equals(myArray[i])) {
                System.out.println("Индекс элемента " + element + " это " + i);
            }
        }
        return element;
    }

    public void printArray() {

        System.out.print(Arrays.toString(myArray));

    }
}