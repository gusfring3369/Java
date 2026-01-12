# Java Command Line Calculator

A simple command line calculator written in Java. This calculator allows users to perform basic arithmetic operations (addition, subtraction, multiplication, division) via the terminal.

## To-Do List - Rookie

1. **Import Scanner**  
   Add at the top of the file.

2. **Create main method**  
   Write as the entry point.

3. **Initialize Scanner**  
   Declare inside the main method.

4. **Set boolean flag**  
   Use for loop control.

5. **Print welcome message**  
   Display "Simple Calculator" and show the operation options.

6. **Start do-while loop**  
   Use for continuous operation.

7. **Display menu inside loop**  
   Print numbered options:

   - 1 = add
   - 2 = subtract
   - 3 = multiply
   - 4 = divide
   - 5 = exit

8. **Read user choice**  
   Use within a try-catch for invalid input.

9. **Handle exit**  
   If chosen, print goodbye and stop the loop.

10. **Validate choice range**  
    If invalid, print error and continue.

11. **Get first number**  
    Prompt and read number (with try-catch).

12. **Get second number**  
    Prompt and read number (with try-catch).

13. **Declare result variable**  
    Use a variable for the result.

14. **Use switch on choice**

    - **Case 1:** add
    - **Case 2:** subtract
    - **Case 3:** multiply
    - **Case 4:** if dividing by zero, print error; otherwise divide

15. **Print result**  
    Format as "num1 operator num2 = result".

16. **Clear input buffer**  
    Clear after each operation.

17. **Close scanner**  
    After loop ends.

18. **Test all cases**

    - Valid operations
    - Divide-by-zero
    - Invalid inputs (letters)
    - Exit

19. **Save and run**  
    Save, compile, and run as instructed.

# OP CAL

## Simple Command-Line Calculator

This program runs a simple calculator in your terminal.

### Usage

1. The calculator displays the following menu:

   ```
   Options:
   1. Addition
   2. Subtraction
   3. Multiplication
   4. Division
   5. Exit
   Choice:
   ```

2. **Enter your choice** (1-5):

   - If you enter an invalid input (not a number), it displays:  
     `Invalid input! Enter a number 1-5.`
   - If you enter 5, it displays:  
     `Goodbye!`  
     and exits.
   - If you enter any number outside 1-4, it displays:  
     `Invalid choice! Try 1-5.`

3. **If you chose 1-4**:

   - You are prompted to enter the first and second number.  
     For each number, if the input is invalid (not a number), it displays:  
     `Invalid number!`  
     and restarts the current loop.

4. **After valid numbers are entered**, the program performs the selected operation:

   - **Addition:**  
     `num1 + num2 = result`
   - **Subtraction:**  
     `num1 - num2 = result`
   - **Multiplication:**  
     `num1 * num2 = result`
   - **Division:**  
     If dividing by zero, displays:  
     `Error: Division by zero!`  
     Otherwise:  
     `num1 / num2 = result`

5. After each operation, the calculator restarts unless you chose 5 to exit.

---

### Example Interaction

```
Simple Command-Line Calculator
Enter numbers and choose operation (or 5 to exit)

Options:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Choice: 1
Enter first number: 20
Enter second number: 22
20.0 + 22.0 = 42.0

Options:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Choice: 4
Enter first number: 10
Enter second number: 0
Error: Division by zero!

Options:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Choice: 5
Goodbye!
```

---
