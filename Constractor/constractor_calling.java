package Constractor;

public class constractor_calling {
    public class Car {
        // Instance variables
        private String make;
        private String model;
        private int year;

        // Parameterized constructor
        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        // Getter methods
        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public static void main(String[] args) {
            // Creating an object of the Car class using the constructor
            Car myCar = new Car("Toyota", "Camry", 2022);

            // Accessing the object's state using getter methods
            System.out.println("Make: " + myCar.getMake());
            System.out.println("Model: " + myCar.getModel());
            System.out.println("Year: " + myCar.getYear());
        }
    }

}
