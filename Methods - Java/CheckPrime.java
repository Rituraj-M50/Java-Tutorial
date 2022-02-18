import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
      
//       This is all basic stuff, taking input n from the user.
      
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      
//       Here, we are getting the output.
      
        System.out.println(isPrime(7));

    }

//    Method to check whether a number is prime or not.
//    This method will return a boolean value - true or false.

    static boolean isPrime(int n){
//       First check, if a number is less than or eqaul to 1, it would not be considered a prime.
        if (n <= 1){
            return false;
        }
        int c = 2;
//       Using while loop the condition is (c*c <= n) i.e. a typical mathematical expression.
//       A number should be greater than or equal to c*c and if it's not then the loop will not run.
        while (c*c <= n){
//           If c divides n and we get the remainder as 0 then the number n can't be prime. Hence, It returns false.
            if (n % c == 0){
                return false;
            }
//           After each iteration, we will increment the value of c.
            c++;
        }
//       If the above case is not satisfied then output will be true.
        return c * c > n;
    }
}

// Rituraj Mahato
