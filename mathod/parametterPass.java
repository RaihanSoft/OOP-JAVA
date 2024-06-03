package mathod;

public class parametterPass {
    public class Example {
    // Method with parameters
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Another method with multiple parameters
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example example = new Example();

        // Calling the greet method with a parameter
        example.greet("John");

        // Calling the addNumbers method with parameters
        int sum = example.addNumbers(5, 7);
        System.out.println("Sum: " + sum);
    }
}

}
