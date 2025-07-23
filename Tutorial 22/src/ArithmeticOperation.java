public class ArithmeticOperation {
    // Method to add two numbers
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition Result: " + result);
    }
    // Method to divide two numbers
    public void divide(int a, int b) {
        try {
            // Attempt to divide a by b
            double result = (double) a / b;
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
