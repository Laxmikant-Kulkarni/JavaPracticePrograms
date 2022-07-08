package edu.advanced.programs;

import java.util.Arrays;

public class RemoveLocalMaxima {

    public static int[] removeLocalMaxima(int[] array) {
        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if ((i > 0 && array[i] <= array[i - 1]) || (i != array.length - 1 && array[i] <= array[i + 1])) {
                result[j++] = array[i];
            }
        }
        System.out.println(result);
        return Arrays.copyOf(result, j);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] array = new int[] { 18, 1, 3, 6, 7, -5 };

        //	int result = SumOfEvenNumbers.sum(vals);

        int[] result =	removeLocalMaxima(array);

        System.out.println(result);



    }

}
