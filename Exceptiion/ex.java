package Exceptiion;

public class ex {
    public static void main(String[] args) {

        try{        int x = 10;
            int y = 0;
            System.out.println(x/y);
        }catch (ArithmeticException i ){
            System.out.println(i);
        }

        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is rayhan");

        }


    }
}
