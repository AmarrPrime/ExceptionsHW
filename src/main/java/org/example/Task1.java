package org.example;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Float number = null;
        while (number == null) {
            System.out.println("Введите дробное число ");
            try {
                number = Float.parseFloat(scanner.next());
            } catch (NumberFormatException exception) {
                number = null;
            }
        }
        System.out.println("Ваше число = " + number);
    }
}

