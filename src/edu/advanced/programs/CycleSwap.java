package edu.advanced.programs;

import java.util.Arrays;

public class CycleSwap {

    public static void main(String[] args) {
        int array[] = new int[]{1, 3, 2, 7, 4};
        //CycleSwap.cycleSwap(array);
        CycleSwap.cycleSwap(array, 2);
        System.out.println(Arrays.toString(array));
    }

    static void cycleSwap(int[] array) {

        int n = 1;

        int[] emptyArr = {};

        if (array.length == 0) {
            array = emptyArr;
        } else {
            for (int i = 0; i < n; i++) {
                int j, last;
                last = array[array.length - 1];
                for (j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = last;
            }
        }
    }

    static void cycleSwap(int[] array, int n) {

        // int n = 1;

        int[] emptyArr = {};

        if (array.length == 0) {
            array = emptyArr;
        } else {

            for (int i = 0; i < n; i++) {
                int j, last;
                last = array[array.length - 1];
                for (j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = last;
            }

        }
    }
}



