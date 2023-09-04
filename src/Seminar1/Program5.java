package Seminar1;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя два числа и выводит
// результат их деления. Если пользователь вводит некорректные данные
// (например, буквы или делитель равен нулю), программа должна выводить сообщение
// "Ошибка" и просить пользователя ввести числа заново.
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean expression = false;
        while (!expression){
            try {
                System.out.println("Введите первое число: ");
                int first = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int second = scanner.nextInt();
                double result = (double)first/second;
                System.out.println("Результат равняется: " + result);
                expression = true;
            } catch (java.util.InputMismatchException exception) {
                System.out.println("Введите число, а не любой другой символ");
                scanner.nextLine();
            } catch (ArithmeticException exception){
                System.out.println("Делить на ноль нельзя. Введите число заново");
            }
        }
        scanner.close();
        String s = "1";
        int a = Integer.parseInt(s);
    }
}
