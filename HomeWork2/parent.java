package HomeWork2;

public class parent {
    String name;
    String location;
    int age;


    parent(String name, String location,int age){
        this.name=name;
        this.location=location;
        this.age= age;
    }

    void display(){
        System.out.println("name :"+name);
        System.out.println("location :"+location);
        System.out.println("age :"+age);

    }
}
