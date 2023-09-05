package seminar3Homework.task1;

import java.util.Scanner;

public class PasswordVerifier {
    private String password;
    Scanner scanner;

    public PasswordVerifier(Scanner scanner, String password) {
        this.password = password;
        this.scanner = scanner;
    }

    void verifyPassword (String password) throws NotValidPassword {
        boolean passwordLength = true;
        boolean isDigit = false;
        boolean isUpperCase = false;

        char [] charArray = password.toCharArray();
        if (charArray.length < 8) {
            passwordLength = false;
        } else {
            for (int i = 0; i < charArray.length; i++) {
                if (Character.isDigit(charArray[i])){
                    isDigit = true;
                }
                if (Character.isUpperCase(charArray[i])){
                    isUpperCase = true;
                }
            }
        }
        if (passwordLength && isDigit && isUpperCase) {
            System.out.println("Проверка пройдена! Пароль принят");
        } else {
            throw new NotValidPassword("Пароль не соответствует требованиям! Придумайте другой пароль!");
        }

    }
}
