package interfacee;

public class extend {
    // Base interface
    interface Shape {
        void draw(); // Abstract method
    }

    // Extended interface
    interface ColoredShape extends Shape {
        String getColor(); // Additional abstract method
    }

    // Class implementing the extended interface
    class ColoredCircle implements ColoredShape {
        private String color;

        // Constructor
        public ColoredCircle(String color) {
            this.color = color;
        }

        // Implementation of the draw method from the Shape interface
        @Override
        public void draw() {
            System.out.println("Drawing a colored circle.");
        }

        // Implementation of the getColor method from the ColoredShape interface
        @Override
        public String getColor() {
            return color;
        }
    }

    public class InterfaceExtensionExample {
        public static void main(String[] args) {
            // Creating an object of the implementing class
            ColoredCircle coloredCircle = new ColoredCircle("Red");

            // Calling methods through the interfaces
            coloredCircle.draw();
            System.out.println("Color: " + coloredCircle.getColor());
        }
    }

}
