package com.company;
import java.util.Scanner;
//1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number! ");
        Scanner scan = new Scanner(System.in);
        try {
            int num = scan.nextInt();
            if (num > 7) System.out.println("Привет");
        } catch (Exception e) {
            System.out.println("It is not a number!");
        }
    }
}