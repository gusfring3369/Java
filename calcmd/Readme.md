# Java Command Line Calculator

A simple command line calculator written in Java. This calculator allows users to perform basic arithmetic operations (addition, subtraction, multiplication, division) via the terminal.

## To-Do List

1. **Import Scanner**  
   Add `import java.util.Scanner;` at the top of the file.

2. **Create main method**  
   Write `public static void main(String[] args)` as the entry point.

3. **Initialize Scanner**  
   Declare `Scanner scanner = new Scanner(System.in);` inside the main method.

4. **Set boolean flag**  
   Use `boolean running = true;` for loop control.

5. **Print welcome message**  
   Display "Simple Calculator" and show the operation options.

6. **Start do-while loop**  
   Use `do { ... } while (running);` for continuous operation.

7. **Display menu inside loop**  
   Print numbered options:  
   - 1 = add  
   - 2 = subtract  
   - 3 = multiply  
   - 4 = divide  
   - 5 = exit

8. **Read user choice**  
   Use `int choice = scanner.nextInt();` within a try-catch for invalid input.

9. **Handle exit**  
   If `choice == 5`, print goodbye and set `running = false;`.

10. **Validate choice range**  
    If `choice < 1` or `choice > 5`, print an error and continue.

11. **Get first number**  
    Prompt "Enter first number:" and read `double num1 = scanner.nextDouble();` (with try-catch).

12. **Get second number**  
    Prompt "Enter second number:" and read `double num2 = scanner.nextDouble();` (with try-catch).

13. **Declare result variable**  
    Use `double result = 0;`.

14. **Use switch on choice**  
    - **Case 1:** `result = num1 + num2`
    - **Case 2:** `result = num1 - num2`
    - **Case 3:** `result = num1 * num2`
    - **Case 4:** Check if `num2 == 0` (print error), else `result = num1 / num2`

15. **Print result**  
    Format as `"num1 operator num2 = result"`.

16. **Clear input buffer**  
    Call `scanner.nextLine();` after each operation.

17. **Close scanner**  
    Use `scanner.close();` after loop ends.

18. **Test all cases**  
    - Valid operations
    - Divide-by-zero
    - Invalid inputs (letters)
    - Exit

19. **Save and run**  
    Save as `Calculator.java`, compile with `javac Calculator.java`, and run with `java Calculator`.