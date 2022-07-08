package edu.basic.programs;

public class MaxValueInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] vals = new int[] { -2, 10, 0, 5 };

        int result = MaxValueInArray.max(vals);

        System.out.println(result == 10);

    }

    private static int max(int[] array) {
        int maxval = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxval < array[i]) {
                maxval = array[i];
            }
        }
        return maxval;
    }
}
