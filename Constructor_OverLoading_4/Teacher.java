package Constructor_OverLoading_4;

public class Teacher {
    //Variable
    String name , Gender,Location,para;
    int age,phone;
    float cgpa;
    //Default Constructor
    Teacher()
    {
        System.out.println("Nothing here");
    }
    //para
    Teacher(String p){
        para=p;
    }
    //Parameter Constructor
    Teacher(String n,int a){
        name = n;
       age = a;
}
    //parameter  constructor
    Teacher(String m,String l){
        Gender = m;
        Location = l;
    }

    //para
    Teacher(String na,String lo,Float cg, int num){
        name = na;
        Location = lo;
        cgpa=cg;
        phone = num;
    }


    //method
    void Display(){
        System.out.println(name);
        System.out.println(Gender);
        System.out.println(age);
        System.out.println(Location);
        System.out.println(phone);
        System.out.println(cgpa);
        System.out.println(para);
                System.out.println("\n");
    }
void dis(){
    System.out.println(para);
    System.out.println("\n");
}


}
