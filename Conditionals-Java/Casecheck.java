import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//       It must be familiar till now.
//       The trim() method in Java String is a built-in function that eliminates leading and trailing spaces.
//       The Java charAt() method returns a character at a specific index position in a string. 
        char ch = input.next().trim().charAt(0);
      
//       While checking condition ch >= 'a' means it check whether the given value of ch is greater than or equal to the ASCII Value of a i.e. 97.
//       Similarly, while checking condition ch >= 'A' means it check whether the given value of ch is greater than or equal to the ASCII Value of a i.e. 65.

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is lowerCase");

        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is upperCase");
        }

    }
}

// Rituraj Mahato
