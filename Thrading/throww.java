package Thrading;

public class throww {
    public class Example {
        public static void main(String[] args) {
            try {
                // Simulating an error situation
                int result = divide(10, 0);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Catching the exception and handling it
                System.out.println("Error: " + e.getMessage());
            }
        }

        public static int divide(int numerator, int denominator) {
            if (denominator == 0) {
                // Throwing an ArithmeticException when attempting to divide by zero
                throw new ArithmeticException("Cannot divide by zero");
            }
            return numerator / denominator;
        }
    }

}
