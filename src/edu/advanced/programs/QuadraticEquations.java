package edu.advanced.programs;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int b = input.nextInt();

        int c = input.nextInt();
        int d = (int) (b * b - 4.0 * a * c);
        if (d > 0.0) {
            int r1 = (int) ((-b + Math.pow(d, 0.5)) / (2.0 * a));
            int r2 = (int) ((-b - Math.pow(d, 0.5)) / (2.0 * a));
            System.out.println(r1);
            System.out.println(r2);
        } else if (d == 0.0) {
            int r1 = (int) (-b / (2.0 * a));
            System.out.println(r1);
            //System.out.println(r2);
        } else {
            System.out.println("no roots");
        }
    }
}
