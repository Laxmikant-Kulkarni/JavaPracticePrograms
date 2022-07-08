package edu.basic.programs;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int BillAmount = sc.nextInt();
        int persons = sc.nextInt();

        int billamountperperson = 0;

        if (BillAmount <= 0) {
            System.out.println("bill total amount cant be negative");

        } else if (persons <= 0) {
            System.out.println("number of friends cant be negative or zero");
        } else {
            billamountperperson = (int) ((BillAmount + (0.1 * BillAmount)) / persons);
            System.out.println(billamountperperson);
        }

    }
}
