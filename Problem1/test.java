package Problem1;

public class test {
    public static void main(String[] args) {
        Birds ob = new Birds();
        ob.catchInsect();
        ob.fly();
        ob.eat();
        ob.sleep();
        System.out.println(" ");
        Fish o = new Fish();
        o.catchFish();
        o.swim();
        o.sleep();
        o.eat();
    }
}
