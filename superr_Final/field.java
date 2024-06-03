package superr_Final;

public class field {
    public class Superclass {
        protected int value;

        public Superclass(int value) {
            this.value = value;
        }
    }

    public class Subclass extends Superclass {
        public Subclass(int value) {
            super(value); // Call the constructor of the superclass
        }

        public void displayValue() {
            System.out.println("Superclass value: " + super.value);
        }
    }

}
