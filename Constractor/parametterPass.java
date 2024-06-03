package Constractor;

public class parametterPass {
    public class Person {
        private String name;
        private int age;

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
            // Creating objects with different initial states using the constructor
            Person person1 = new Person("John", 30);
            Person person2 = new Person("Alice", 25);

            // Accessing object states using getter methods
            System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge());
            System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge());
        }
    }

}
