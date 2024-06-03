package Thrading;

public class throwss {
    public class Example {
        public static void main(String[] args) {
            try {
                // Calling a method that declares possible exceptions using 'throws'
                processFile("example.txt");
            } catch (FileNotFoundException e) {
                // Catching the exception and handling it
                System.out.println("File not found: " + e.getMessage());
            }
        }

        public static void processFile(String fileName) throws FileNotFoundException {
            // Code that might throw FileNotFoundException
            // ...
            throw new FileNotFoundException("File not found: " + fileName);
        }
    }

}
