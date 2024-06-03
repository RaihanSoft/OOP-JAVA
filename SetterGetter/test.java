package SetterGetter;

public class test{
    public static void main(String[] args) {
        person p1 = new person();
       //  p1.age=20;
       // p1.name="Raihan";

        p1.setName("Raihan");
        p1.getName();

        p1.setAge(20);

        p1.display();
    }
}
