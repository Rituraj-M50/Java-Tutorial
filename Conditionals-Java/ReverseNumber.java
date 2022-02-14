import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int res = 0;
        int n = input.nextInt();

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            res = (res * 10) + rem;
        }
        System.out.println(res);
    }
}
