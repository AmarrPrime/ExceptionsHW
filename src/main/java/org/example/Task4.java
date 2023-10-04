package org.example;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string please: ");
        String strg = scanner.nextLine();
        if (strg.equals("")) {
            System.out.println("You should never enter this.");
            throw new Exception();
        }
    }
}
