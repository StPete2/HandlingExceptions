package seminar3Homework.task1;

import java.util.Scanner;

//Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)
// Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает
// строку пароля и проверяет его на соответствие следующим правилам:
//
// Пароль должен быть не менее 8 символов.
// Пароль должен содержать хотя бы одну цифру.
// Пароль должен содержать хотя бы одну заглавную букву.
// Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
public class PasswordVerifierApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль для проверки: ");
        String password = scanner.nextLine();
        PasswordVerifier passwordVerifier = new PasswordVerifier(scanner, password);
        try {
            passwordVerifier.verifyPassword(password);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
