package Class_Object_1;

public class p1 {
    public static void main(String[] args) {

        Teacher Teacher1 = new Teacher();
        Teacher1.name="Raihan";
        Teacher1.gender ="male";
        Teacher1.cgpa = 3.14f;
        Teacher1.age= 22;
        Teacher1.phone=969365539;

        Teacher1.Display();

        Teacher Teacher2 = new Teacher();
        Teacher2.age= 23;
        Teacher2.phone= 1969365539;
        Teacher2.gender="mael";
        Teacher2.cgpa = 3.80f;
        Teacher2.name="Siyam";

        Teacher2.Display();



    }
}
