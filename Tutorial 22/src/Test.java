import java.util.Scanner;

public class Test {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    ArithmeticOperation arithmetic = new ArithmeticOperation();
    // First set of inputs
        System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();
    // Call add and divide methods
        arithmetic.add(num1, num2);
        arithmetic.divide(num1, num2);
    // Second set of inputs with zero value
        System.out.print("Enter first number (for second test): ");
    num1 = scanner.nextInt();
        System.out.print("Enter second number (for second test, use 0): ");
    num2 = scanner.nextInt();
    // Call add and divide methods again
        arithmetic.add(num1, num2);
        arithmetic.divide(num1, num2);
    // Close the scanner
        scanner.close();
}
}
