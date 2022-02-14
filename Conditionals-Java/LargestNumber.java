import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//       Taking three inputs from the user for a, b and c.

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//      Question: Find the largest of three numbers i.e. a, b and c.

//      Case 1 - Basic Approach
      
//      Firstly, Declare an int variable max and assign the value of a to it.
      
        int max = a;
      
//      Check whether the value of b is greater than max, if it's so then reassign the value of b to max.
      
        if (b > max){
            max = b;
        }
      
//      Check whether the value of c is greater than max, if it's so then reassign the value of c to max.
      
        if (c > max) {
            max = c;
        }
        System.out.println("Maximum value among the numbers would be :" + max);
    }
}

// Rituraj Mahato
