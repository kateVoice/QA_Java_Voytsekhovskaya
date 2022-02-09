package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a massive of numbers (using space button between): ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] arr = line.split(" ");
        for (int i = 0; i < arr.length; i++) {
            try {
                int num = Integer.parseInt(arr[i]);
                if ((num % 3) == 0 && (num != 0) ) {
                    System.out.println(num);
                }
            } catch (Exception ex) {
                double num1 = Double.parseDouble(arr[i]);
                if ((num1 % 3) == 0 && (num1 != 0) ) {
                    System.out.println(num1);
                }
            }
        }
    }
}