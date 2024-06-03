package ExceptionHandling;

public class Throw {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 5;
            int Result = a / b;
            System.out.println(Result);

         throw new HridoyException();//forcefully in catch block

        }catch (Exception e){
            System.out.println(""+e);

        } catch (HridoyException e) {
            throw new RuntimeException(e);
        }


    }
}
