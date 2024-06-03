package Constractor;

public class normal {
    public class Person {
        // Instance variables
        private String name;
        private int age;

        // No-argument constructor (provided by Java if none is explicitly defined)
        public Person() {
            // Default initialization or other code
        }

        // Parameterized constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public static void main(String[] args) {
            // Creating an object of the class using the no-argument constructor
            Person person = new Person();

            // Accessing the object's state
            System.out.println("Default Name: " + person.getName());
            System.out.println("Default Age: " + person.getAge());
        }
    }

}
