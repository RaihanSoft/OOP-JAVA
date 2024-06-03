package Problem;

public class dolphin extends animal implements catchFish{
    void swim(){

        System.out.println("Dolphine can swim");

    }


    @Override
    public void catchfish() {
        System.out.println("Caching fish");

    }
}
