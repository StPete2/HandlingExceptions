package Seminar2Homework.task2;

import java.util.Scanner;

//Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их
// деление. Если второе число равно нулю, программа должна выбрасывать исключение
// DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить результат деления.
//
// Обратите внимание, что в обоих задачах используются собственные исключения, которые
// наследуются от класса Exception. Это позволяет нам определить специфическую причину
// ошибки и передать информацию об ошибке для последующей обработки.

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = scanner.nextDouble();
        try {
            if (number2 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо!");
            } else {
                double result = number1/number2;
                System.out.printf("Результат деления числа %.2f и числа %.2f = %.2f", number1, number2, result);
            }
        } catch (DivisionByZeroException exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        }
        scanner.close();
    }
}
