package HomeWork2;

public class Employee extends parent{
    double salary;
    Employee(String name,String location,int age,double salary){
        super(name,location,age);
        this.salary=salary;
    }


    void display(){
        super.display();
        System.out.println("salary :"+salary);
        System.out.println("\n");
    }
}
