package edu.basic.programs;

import java.util.Scanner;

public class HelloAgent {
    final static int PASSWORD = 13333;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();

        if (pass == PASSWORD) {
            System.out.println("Hello Agent");
        } else {
            System.out.println("ACCESS DENIED");
        }
    }
}
