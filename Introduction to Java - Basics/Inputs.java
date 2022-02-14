// java.util.Scanner is a utility class already available in JVM (Java Virtual Machine)

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
//       Scanner class is used to take input from the Keyboard, Hence we use System.in
      
//       Always remember to put a ';' at the end.
      
        Scanner input = new Scanner(System.in);
      
//       Use println to print the next output in new line.
//       Use print to print the next output in same line.
      
        System.out.println("Please enter some input:");
      
//       Taking the input from the user.
      
        int roll_no = input.nextInt();
     
//       We have things like nextInt(), nextLine() and many other.
//       Visit this link to know more about Scanner Class in Java - https://www.jigsawacademy.com/blogs/java/scanner-class-in-java/
     
        System.out.println("Your roll_no is " + roll_no);
     
    }
}

// Rituraj Mahato
