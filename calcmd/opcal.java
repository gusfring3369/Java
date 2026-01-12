import java.util.*;

public class opcal {
    public static void main(String[] args) {
        // get an choice input between 1 - 5 ( Try and Catch )
        // reject anything above or below the limit
        // get the no 1 ( Try and Catch )
        // get the no 2 ( Try and Catch )
        // switch based on choice no
        // Clear the scanner
        // and print the result
        // repeat

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(
                    "\nOptions:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\nChoice: ");
            int choice;

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input! Enter a number 1-5");
                scanner.nextLine();
                continue;
            }

            if (choice == 5) {
                System.out.println("Bye XD");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invaild Choice");
                continue;
            }

            System.out.println("Enter First Number");
            int num1;
            try {
                num1 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid, Enter a Number");
                scanner.nextLine();
                continue;
            }

            System.out.println("Enter Second Number");
            int num2;
            try {
                num2 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid, Enter a Number");
                scanner.nextLine();
                continue;
            }

            int result;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by Zero");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                    break;
            }
            scanner.nextLine();
        } while (true);
        scanner.close();
    }
}