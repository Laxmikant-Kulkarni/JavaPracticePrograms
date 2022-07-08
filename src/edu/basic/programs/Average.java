package edu.basic.programs;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = new int[20];
        int average = 0;
        int sum = 0;
        int i =0;
        Scanner sc = new Scanner(System.in);
        for ( i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)
                break;
            // System.out.println(arr[i]);

            sum = sum + arr[i];

        }
//		System.out.println(sum);

        average = (sum/i);

        System.out.println(average);

    }

}
