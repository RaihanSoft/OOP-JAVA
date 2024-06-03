package abstractt;

public class mathod {
    abstract class Animal {
        // Abstract method
        public abstract void makeSound();

        // Regular (concrete) method
        public void sleep() {
            System.out.println("Animal is sleeping.");
        }
    }

    class Dog extends Animal {
        // Implementation of the abstract method
        @Override
        public void makeSound() {
            System.out.println("Dog barks.");
        }
    }

}
