package lab;
import java.util.Scanner;
public class FibonnaciSeries {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of terms for Fibonacci series: ");
            int n = scanner.nextInt();

            System.out.println("Fibonacci series up to " + n + " terms:");

            // Print the Fibonacci series
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }

            scanner.close();
        }

        // Function to calculate the nth Fibonacci number
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }
