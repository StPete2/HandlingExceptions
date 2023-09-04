package Seminar2Homework.task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье целое число: ");
        int number3 = scanner.nextInt();
        try {
            if (number1 > 100){
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона.");
            } else if (number2 <0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона.");
            } else if ((number1 + number2) <10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала.");
            } else if (number3 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо.");
            } else {
                System.out.println("Проверка пройдена успешно!");
            }
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        }
    }
}
