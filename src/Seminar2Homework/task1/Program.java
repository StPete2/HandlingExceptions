package Seminar2Homework.task1;

import java.util.Scanner;

//Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет,
// является ли оно положительным. Если число отрицательное или равно нулю,
// программа должна выбрасывать исключение InvalidNumberException с сообщением
// "Некорректное число". В противном случае, программа должна выводить сообщение
// "Число корректно".

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        try {
            if (number < 0 || number == 0) {
                throw new InvalidNumberException("Некорректное число!");
            } else {
                System.out.println("Число корректно!");
            }
        } catch (InvalidNumberException exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        }
        scanner.close();
    }
}
