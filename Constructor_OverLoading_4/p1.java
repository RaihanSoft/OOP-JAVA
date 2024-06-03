package Constructor_OverLoading_4;

public class p1 {
    public static void main(String[] args) {

        Teacher o = new Teacher();
        o.dis();

        Teacher ob  = new Teacher("This is siyam");
        ob.dis();

     Teacher ob1 = new Teacher("Raihan",22);
     ob1.Display();

        Teacher ob2 = new Teacher("male","Gazipur");
        ob2.Display();

        //method
        Teacher ob3 = new Teacher ("Siyam","Savar",3.60f,1969365539);
        ob3.Display();

    }
}