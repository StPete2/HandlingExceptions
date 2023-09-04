package Seminar1;
public class Program4 {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException caught: " + exception.getMessage());
            System.out.println("Exception: " + exception);
            exception.printStackTrace();
        }
    }
}
// ArithmeticException exception = new ArithmeticException("Division by zero");
