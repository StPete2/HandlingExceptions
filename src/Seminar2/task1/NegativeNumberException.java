package Seminar2.task1;

public class NegativeNumberException extends Exception {
    // Класс исключения для отрицательных чисел
    public NegativeNumberException(String message) {
        super(message);
    }
}
