package SetterGetterType;

public class Person {
        // Private instance variables
        private String name;
        private int age;

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for age
        public void setAge(int age) {
            this.age = age;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        public static void main(String[] args) {
            // Create an instance of the Person class
            Person person = new Person();

            // Use setter methods to set values
            person.setName("John Doe");
            person.setAge(25);

            // Use getter methods to retrieve values
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }

