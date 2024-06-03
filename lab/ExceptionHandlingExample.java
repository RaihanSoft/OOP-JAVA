package lab;
import java.util.Scanner;


public class ExceptionHandlingExample {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter a number: ");
                int numerator = scanner.nextInt();

                System.out.print("Enter another number: ");
                int denominator = scanner.nextInt();

                int result = divideNumbers(numerator, denominator);
                System.out.println("Result: " + result);
            } catch (ArithmeticException ex) {
                System.err.println("Error: " + ex.getMessage());
            } catch (Exception ex) {
                System.err.println("An unexpected error occurred.");
            } finally {
                // This block will be executed regardless of whether an exception occurred or not
                scanner.close();
            }
        }

        public static int divideNumbers(int numerator, int denominator) {
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return numerator / denominator;
        }
    }