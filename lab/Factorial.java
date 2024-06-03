package lab;
import java.util.Scanner;
public class Factorial {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a non-negative integer to calculate its factorial: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
            } else {
                long factorialResult = calculateFactorial(n);
                System.out.println("Factorial of " + n + " is: " + factorialResult);
            }

            scanner.close();
        }

        // Function to calculate the factorial of a number
        public static long calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }
    }
