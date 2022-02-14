import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 0;
//      Take inputs from the user till the user does not press X or x
        while (true) {
//      Take operator as input
            System.out.println("Enter the operator :");
//      The trim() method in Java String is a built-in function that eliminates leading and trailing spaces.
//      The Java charAt() method returns a character at a specific index position in a string. 
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//      Take inputs of two numbers a and b
                System.out.print("Enter two numbers :");
                int a = input.nextInt();
                int b = input.nextInt();
              
//      Give various conditions

                if (op == '+') {
                    res = a + b;
                }
                if (op == '-') {
                    res = a - b;
                }
                if (op == '*') {
                    res = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        res = a / b;
                    }
                }
                if (op == '%') {
                    res = a % b;
                }
              
//      Give the condition to get out of the loop.
              
                else if (op == 'x' || op == 'X'){
                    break;
                }
//      If a user inputs something else then print invalid.
                else {
                    System.out.println("Invalid");
                }
            }
//      Print the final result out in the console
            System.out.println(res);
        }
    }
}

// Rituraj Mahato
