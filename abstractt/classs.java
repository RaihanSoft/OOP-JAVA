package abstractt;

public class classs {
    // Abstract class
    abstract class Shape {
        // Abstract method (no method body)
        public abstract void draw();

        // Regular (concrete) method
        public void display() {
            System.out.println("Displaying the shape.");
        }
    }

    // Concrete subclass
    class Circle extends Shape {
        // Implementation of the abstract method
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }

}
