package lab;
import java.util.Scanner;

public class gcd_lcm {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate and display GCD
            int gcdResult = calculateGCD(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);

            // Calculate and display LCM
            int lcmResult = calculateLCM(num1, num2);
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);

            scanner.close();
        }

        // Function to calculate the GCD using Euclidean algorithm
        public static int calculateGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // Function to calculate the LCM using the relationship: LCM(a, b) = |a * b| / GCD(a, b)
        public static int calculateLCM(int a, int b) {
            int gcd = calculateGCD(a, b);
            // Ensure that the result is non-negative
            return Math.abs(a * b) / gcd;
        }
    }
