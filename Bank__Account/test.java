package Bank__Accoint;

import java.util.Scanner;

public class test extends Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Withdrow  balance: ");
        int a = sc.nextInt();



        Account ob = new Account();
        ob.setAll(10000,2000,5000);


        System.out.println("Diposit: "+ob.getDiposit());
        System.out.println("Withdrow: "+ob.getWithdrow());
        System.out.println("MainBalence: "+ob.getMainBalance());



    }
}
