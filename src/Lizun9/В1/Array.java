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
            doubleArray(element);
        }
    }

    public void doubleArray(Object element) {
        Object[] myArray2 = new Object[myArray.length * 2];
        System.arraycopy(myArray, 0, myArray2, 0, myArray.length);
        myArray2[10] = element;
        System.out.println("Новый увеличенный массив" + Arrays.toString(myArray2));
    }


    public Object getElement(int i) {
        System.out.println("Элемент " + myArray[i] + "; под индексом " + i);
        return myArray[i];
    }

    public boolean contains(Object element) {
        for (Object o : myArray) {
            if (element.equals(o)) {
                System.out.println("Элемент " + element + " есть в массиве. ");
                return true;
            }
        }
        System.out.println("Такого элемента нет в массиве");
        return false;
    }

    public boolean getIndex(Object element) {
        for (int i = 0; i < myArray.length; i++) {
            if (element.equals(myArray[i])) {
                System.out.println("Индекс элемента " + element + " это " + i);
                return true;
            }
        }
        System.out.println(element + " нету в массиве");
        return false;
    }

    public void printArray() {
        System.out.println("Первоначальный массив " + Arrays.toString(myArray));
    }

    public void delete(int k) {
        System.out.println("Массив до удаления элемента по индексу : ");
        for (int l = 0; l < myArray.length; l++) {
            System.out.println("Элемент " + myArray[l] + " индекс " + l);
        }
        myArray[k] = null;
        for (int i = k + 1; i < myArray.length; i++) {
            myArray[i - 1] = myArray[i];
            myArray[i] = null;
        }
        System.out.println("Массив после удаления элемента по индексу : ");
        for (int g = 0; g < myArray.length; g++) {
            System.out.println("Элемент " + myArray[g] + " индекс " + g);
        }
    }

    public void delete(Object element) {
        System.out.println("Массив до удаления элемента : ");
        for (int l = 0; l < myArray.length; l++) {
            System.out.println("Элемент " + myArray[l] + " индекс " + l);
        }
        for (int i = 0; i < myArray.length - 1; i++) {
            if (element.equals(myArray[i])) {
                myArray[i] = null;
                for (int j = i + 1; j < myArray.length; j++) {
                    myArray[j - 1] = myArray[j];
                    myArray[j] = null;
                }
            }
        }
        System.out.println("Массив после удаления элемента : ");
        for (int g = 0; g < myArray.length; g++) {
            System.out.println("Элемент " + myArray[g] + " индекс " + g);
        }
    }
}
