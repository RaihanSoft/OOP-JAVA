package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println("Result:" + z);
            
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Exception"+a);
        }catch (Exception a2) {
            System.out.println("Exception is :"+a2);

        }
            System.out.println("Last line of the program");



        }


    }
