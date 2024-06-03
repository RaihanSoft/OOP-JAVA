package MultiThreading;

public class Runable {
    public static void main(String[] args) {
        A ob = new A();
        B o= new B();
        Thread t = new Thread(ob);
        t.start();
        Thread t1 = new Thread(o);
        t1.start();
    }
}
