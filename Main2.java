package com.company;
import java.util.Scanner;
// Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
//если нет, то вывести "Нет такого имени"

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Enter a name! ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (name.equalsIgnoreCase("Вячеслав") ) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}