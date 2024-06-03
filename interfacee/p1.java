package interfacee;

public class p1 {
    // Defining an interface
    interface Shape {
        // Abstract method
        void draw();

        // Another abstract method
        double calculateArea();
    }

    // Implementing the interface in a class
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

}
