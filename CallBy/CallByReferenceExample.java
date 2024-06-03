package CallBy;

public class CallByReferenceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        System.out.println("Before calling the method: Dog's name = " + myDog.name);

        // Call the method with the Dog object as an argument
        modifyDogName(myDog);

        // After the method call, changes to the Dog object are reflected outside the method
        System.out.println("After calling the method: Dog's name = " + myDog.name);
    }

    // A method that modifies the Dog object's state
    public static void modifyDogName(Dog dog) {
        System.out.println("Inside the method (before modification): Dog's name = " + dog.name);

        // Modify the Dog object's state
        dog.name = "Max";

        System.out.println("Inside the method (after modification): Dog's name = " + dog.name);

        // Reassigning the reference does not affect the original reference outside the method
        dog = new Dog("Charlie");
        System.out.println("Inside the method (after reassignment): Dog's name = " + dog.name);
    }
}
