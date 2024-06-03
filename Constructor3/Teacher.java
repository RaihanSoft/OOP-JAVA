package Constructor3;

public class Teacher {
    //variable
    String name, gender;
    int age;
    //Constructor method
    Teacher (String n,int ag,String ge) {
        name = n;
        gender = ge;
        age = ag;
    }
    //method
    void Display(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println("\n");

        }

    }
