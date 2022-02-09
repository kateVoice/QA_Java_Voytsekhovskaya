package com.company;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
        task1();
        //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
        //если нет, то вывести "Нет такого имени"
        task2();
        //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        task3();
    }

    public static void task1 (){
        System.out.println("Enter a number! ");
        Scanner scan = new Scanner(System.in);
        try {
            int num = scan.nextInt();
            if (num > 7) System.out.println("Привет");
            } catch (Exception e) {
            System.out.println("It is not a number!");
            }
    }
    public static void task2 (){
        System.out.println("Enter a name! ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (name.equalsIgnoreCase("Вячеслав") ) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
    public static void task3 () {
        System.out.println("Enter a massive of numbers (using space button between): ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] arr = line.split(" ");
        for (int i = 0; i < arr.length; i++) {
            try {
                int num = Integer.parseInt(arr[i]);
                if ((num % 3) == 0 && (num != 0)) {
                    System.out.println(num);
                }
            } catch (Exception ex) {
                double num1 = Double.parseDouble(arr[i]);
                if ((num1 % 3) == 0 && (num1 != 0)) {
                    System.out.println(num1);
                }
            }
        }
    }
}