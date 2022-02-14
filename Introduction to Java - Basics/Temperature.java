import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in C :");
//       nextFloat() is another Scanner Class in Java.
        float temp_in_C = input.nextFloat();
//       General Formula to calculate C to F.
        float temp_in_F = (temp_in_C * 9/5) + 32;
        System.out.println("The temperature " + temp_in_C + " C will be " + temp_in_F + " F");
    }
}

// Rituraj Mahato
