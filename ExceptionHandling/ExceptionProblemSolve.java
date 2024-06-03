package ExceptionHandling;

import java.util.Scanner;

public class ExceptionProblemSolve {
    public static void main(String[] args) {


int count = 1;
do {

            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Number 1: ");
                int a = sc.nextInt();
                System.out.print("Enter Number 2: ");
                int b = sc.nextInt();
                int Result = a / b;
                System.out.println("Result: " + a + "/" + b + "= " + Result);
                count=2;

            } catch (Exception e) {
                System.out.println("Exception " + e);
                System.out.println("You must inter an integer please try again!");
            }

        }while (count==1);

}

    }


