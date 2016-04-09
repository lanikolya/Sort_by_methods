package com.company;

import java.util.Random;

public class Main {

    /*
    task: -create array with random numbers from 0 to 30
          -sort by ascending order
     */


    public static void main(String[] args) {
        int[] array = getFullArray(10);
        showArrayInConsole(array);
        array = sortArray(array);
        showArrayInConsole(array);
    }
//Method for filling array
    public static int[] getFullArray(int count) {
        int[] array = new int[count];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31);
        }
        return array;
    }

    //Method to display an array on the screen
    private static void showArrayInConsole(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
    }

    //Method for sort array
    private static int[] sortArray(int[] arrayNotSorted) {
        for (int i = 0; i < arrayNotSorted.length - 1; i++) {
            for (int j = 0; j < arrayNotSorted.length - 1 - i; j++) {
                if (arrayNotSorted[j] > arrayNotSorted[j + 1]) {
                    int k = arrayNotSorted[j];
                    arrayNotSorted[j] = arrayNotSorted[j + 1];
                    arrayNotSorted[j + 1] = k;
                }
            }
        }
        return arrayNotSorted;
    }
}

