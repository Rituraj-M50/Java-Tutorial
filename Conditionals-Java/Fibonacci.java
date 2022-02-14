import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
//       Assigning the value of 0 and 1 to a and b as Fibonacci Series starts with 0 and 1.
      
        int a = 0;
        int b = 1;
      
//       Now we have to give input n, it would tell the computer that ww need the nth number from fibonacci series.
      
        int n = input.nextInt();
      
//       We would be setting the counter from 2 as fibonacci series is 0, 1, 1, 2, 3, 5, ...
//       Already we have taken a = 0 and b = 1 so we would be starteing from count = 2.
      
        int count = 2;
      
//       Using while loop here with condition - n should be greater than 2.

        while (count <= n){
          
//       Here we would be swapping the numbers to move ahead after each iteration.
          
//       Initialisation of a temporary variable and assigning the value of b to it.
//       Now, we would be reassigning value of b + a to b.
//       Last step would be reassigning value of temp (which is equal to b) to a.
          
            int temp = b;
            b = b + a;
            a = temp;
          
//       After each iteration we would be increasing the value of count by 1.
//       This will make sure that multiple iteration will be carried out till it reaches nth fibonacci number.
          
            count++;
        }
        System.out.println(b);
    }
}

// Rituraj Mahato
