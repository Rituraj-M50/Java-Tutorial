import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//      Declaring a variable res and assigning value 0 to it.
        
        int res = 0;
        
//      Taking the input from the user.
        
        int n = input.nextInt();
        
//      Using while loop with condition (n > 0).

        while (n > 0) {
//      This part is purely mathematical. But still i would like to elaborate.
//      Firstly, obtaining the remainder after dividing n with 10. The value of the remainder will be assigned to variable rem.
//      After each iteration we have to divide n by 10.
            int rem = n % 10;
            n /= 10;
            res = (res * 10) + rem;
//      For this problem, I would like you to do it manually in pen and paper mode.
//      It's not that hard to understand. For example - Take a number 134.
        }
        System.out.println(res);
    }
}

// Rituraj Mahato
