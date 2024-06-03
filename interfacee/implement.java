package interfacee;

public class implement {
    // Interface
    interface Shape {
        void draw(); // Abstract method
        double calculateArea(); // Abstract method
    }

    // Class implementing the interface
    class Circle implements Shape {
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Implementation of the draw method
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }

        // Implementation of the calculateArea method
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Another class implementing the same interface
    class Rectangle implements Shape {
        private double length;
        private double width;

        // Constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Implementation of the draw method
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle.");
        }

        // Implementation of the calculateArea method
        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    public class InterfaceImplementationExample {
        public static void main(String[] args) {
            // Creating objects of the implementing classes
            Circle circle = new Circle(5.0);
            Rectangle rectangle = new Rectangle(4.0, 6.0);

            // Calling methods through the interface
            System.out.println("Circle Area: " + circle.calculateArea());
            circle.draw();

            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            rectangle.draw();
        }
    }

}
