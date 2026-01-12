import java.util.*;

// Rookie Calculator

public class main {
    public static void main(String[] args) {
        int inputOne = 0;

        do {
            System.out.println("Please choose an operation:\n" +
                    "   - 1 = add\n" +
                    "   - 2 = subtract\n" +
                    "   - 3 = multiply\n" +
                    "   - 4 = divide\n" +
                    "   - 5 = exit");

            Scanner scanner = new Scanner(System.in);
            inputOne = scanner.nextInt();

            if (inputOne == 1) { // Addition
                System.out.println("Enter the first number to add:");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number to add:");
                int num2 = scanner.nextInt();
                int sum = num1 + num2;
                System.out.println("Result: " + sum);
            } else if (inputOne == 2) { // Subtraction
                System.out.println("Enter the number to subtract from:");
                int num1 = scanner.nextInt();
                System.out.println("Enter the number to subtract:");
                int num2 = scanner.nextInt();
                int diff = num1 - num2;
                System.out.println("Result: " + diff);
            } else if (inputOne == 3) { // Multiplication
                System.out.println("Enter the first number to multiply:");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number to multiply:");
                int num2 = scanner.nextInt();
                int product = num1 * num2;
                System.out.println("Result: " + product);
            } else if (inputOne == 4) { // Division
                System.out.println("Enter the dividend:");
                int num1 = scanner.nextInt();
                System.out.println("Enter the divisor:");
                int num2 = scanner.nextInt();
                if (num2 != 0) {
                    int quotient = num1 / num2;
                    System.out.println("Result: " + quotient);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } else if (inputOne == 5) { // Exit
                System.out.println("Exiting calculator. Goodbye!");
            } else {
                System.out.println("Invalid option. Please choose a valid operation.");
            }
        } while (inputOne != 5);
    }

}
