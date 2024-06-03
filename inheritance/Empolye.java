package inheritance;

public class Empolye extends Parent{
     double salary;

    void mathod1(String n,String a,int ag,double sa){
       this. name=n;
       this. address= a;
        this.age=ag;
        this.salary =sa;
    }

    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

}
