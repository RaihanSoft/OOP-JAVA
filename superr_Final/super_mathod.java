package superr_Final;

public class super_mathod {
    public class Superclass {
        public void display() {
            System.out.println("Superclass display method");
        }
    }

    public class Subclass extends Superclass {
        public void display() {
            super.display(); // Invoke the display method of the superclass
            System.out.println("Subclass display method");
        }
    }

}
