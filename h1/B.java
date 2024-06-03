package h1;

public class B extends A{
    String gender;
    B(int id, int number, int age,String gender){
        super(id,number,age);
        this.gender=gender;

    }
    void add(){
        super.add();
        System.out.println("Gender:"+gender);

    }
}
