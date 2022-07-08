package edu.basic.programs;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] vals = new int[] { -2, 10, 0, 5 };

        int result = SumOfEvenNumbers.sum(vals);

        System.out.println(result == 8);

    }

    private static int sum(int[] array) {
        // int maxval = array[0];

        int sumofevennumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumofevennumbers = sumofevennumbers + array[i];
            } else if (array.length == 0) {
                break;
            }
        }
        return sumofevennumbers;

    }
}
