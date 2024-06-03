package Constractor;

public class chaning {
    public class ConstructorChainingExample {
        private String name;
        private int age;

        // First constructor with two parameters
        public ConstructorChainingExample(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Parameterized Constructor with name and age called");
        }

        // Second constructor with one parameter, chaining to the first constructor
        public ConstructorChainingExample(String name) {
            this(name, 0); // Calls the first constructor with a default age value
            System.out.println("Parameterized Constructor with name called");
        }

        // Third constructor with no parameters, chaining to the second constructor
        public ConstructorChainingExample() {
            this("Default Name"); // Calls the second constructor with a default name value
            System.out.println("Default Constructor called");
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            ConstructorChainingExample person1 = new ConstructorChainingExample("John", 30);
            person1.displayInfo();

            System.out.println();

            ConstructorChainingExample person2 = new ConstructorChainingExample("Alice");
            person2.displayInfo();

            System.out.println();

            ConstructorChainingExample person3 = new ConstructorChainingExample();
            person3.displayInfo();
        }
    }

}
