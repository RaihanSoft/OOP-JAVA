package Staric_variable_6;

public class Students {
    String name;
    int id;
   static String gender =  "male";

   Students(String n, int i){
       name = n;
       id = i;
   }

   void disp(){
       System.out.println(name);
       System.out.println(id);
       System.out.println(gender);
       System.out.println("\n");
   }


}
