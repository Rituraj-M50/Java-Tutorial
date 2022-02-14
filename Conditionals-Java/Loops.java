import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      Question: Print numbers from 1 to 5 using for loop.
      
//       The Java for loop is used to iterate a part of the program several times. 
//       If the number of iteration is fixed, it is recommended to use for loop.

//       Syntax of for loop

        for (int i = 1; i <= 6; i ++) {
            System.out.println(i);
        }

//      Question: Print numbers from 1 to n using for loop.

        int n = input.nextInt();
      
        for (int num = 0; num <= n; num++) {
            System.out.print(num + " ");
        }
      
//      Question: Print numbers from 1 to 5 using while loop.
      
//      The Java while loop is used to iterate a part of the program several times.
//      If the number of iteration is not fixed, it is recommended to use while loop.

//       Syntax of while loop

        int count = 1;
        while (count != 6){
            System.out.println(count);
            count += 1;
        }
      
//      Question: Print numbers from 1 to 5 using do while loop.  
      
//      The Java do-while loop is used to iterate a part of the program several times.
//      Use it if the number of iteration is not fixed and you must have to execute the loop at least once.
//      The main difference between while and do while loop is do while loop will surely iterate atleast once.

//       Syntax of do while loop
      
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a <= 5);

    }
}

// Rituraj Mahato 
