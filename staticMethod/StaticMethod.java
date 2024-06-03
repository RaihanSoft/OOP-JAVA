package staticMethod;

public class StaticMethod {
    static int id;
   static String name;
    StaticMethod(int i , String n){
        id =i;
        name=n;

    }
    static void adder(){
        System.out.println(id);
        System.out.println(name);
    }
}
