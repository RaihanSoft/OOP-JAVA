package THread;

public class B extends Thread{
    public void run(){
        System.out.println("This is Raihan");


        for (int i=10;i<20;i++){
            System.out.println(i);

            try {

                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }

        }
}}
