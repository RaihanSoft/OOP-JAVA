package CallBy;

public class Value {

        public static void main(String[] args) {
            int x = 10;
            System.out.println("Before calling the method: x = " + x);

            // Call the method with x as an argument
            modifyValue(x);

            // After the method call, the value of x remains unchanged
            System.out.println("After calling the method: x = " + x);
        }

        // A method that modifies its parameter
        public static void modifyValue(int a) {
            System.out.println("Inside the method (before modification): a = " + a);

            // Modify the parameter
            a = 20;

            System.out.println("Inside the method (after modification): a = " + a);
        }
    }

