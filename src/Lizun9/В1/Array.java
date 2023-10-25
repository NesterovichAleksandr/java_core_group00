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
        if (!(myArray[9] == null) && !(element == myArray[9])) {
            Object[] myArray2 = new Object[myArray.length * 2];
            System.arraycopy(myArray, 0, myArray2, 0, myArray.length);
            myArray2[10] = element;
            System.out.println("Новый увеличенный массив" + Arrays.toString(myArray2));
        }
    }

    public Object getElement(int i) {
        System.out.println("Элемент " + myArray[i] + "; под индексом " + i);
        return myArray[i];
    }

    public void contains(Object element) {
        for (Object o : myArray) {
            if (element.equals(o)) {
                System.out.println("Элемент " + element + " есть в массиве. ");
            }
        }
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
        System.out.println("Первоначальный массив " + Arrays.toString(myArray));
    }

    public void delete(int k) {
        myArray[k] = null;
        for (int i = k + 1; i < myArray.length; i++) {
            myArray[i - 1] = myArray[i];
            myArray[i] = null;
        }
        System.out.println("Новый массив, без элемента, который был под индексом " + k + " : " + Arrays.toString(myArray));
    }

    public void delete(Object element) {

        for (int i = 0; i < myArray.length; i++) {
            if (element.equals(myArray[i])) {
                myArray[i] = null;
            }
        }
        System.out.println("Новый массив, без элемента  " + element + " : " + Arrays.toString(myArray));
    }
}
