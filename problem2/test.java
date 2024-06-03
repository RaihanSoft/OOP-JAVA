package problem2;

public class test {
    public static void main(String[] args) {
        Bala ob = new Bala();

        try {

            ob.getPublished(5000);

        }catch (Exception e){
            System.out.println("Excepton :"+e);
        }



        ob.BookCover="Java is a programming language";

        ob.display();






    }
}
