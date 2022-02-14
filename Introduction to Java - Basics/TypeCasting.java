// Type casting is a method or process that converts a data type into another data type in both ways manually and automatically.

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//       Type Casting
      
//       Let's see Manual Type Casting Example -
//       Firstly, we would be converting a float to an integer.
      
        int num = (int)(65.67f);
        System.out.println("Conversion of float to int will be " + num);

//       Let's see Automatic Type Casting Examples -
//       Now, we would be auto converting a byte to integer.

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println("Conversion of byte to int will give " + d);

//       See this example closely, we have assigned a character to a variable num1 which is declared as int datatype.
      
        int num1 = 'A';
        System.out.println("The value of char h in int data type will be " + num1);
      
//      We would be getting the ASCII Value of A i.e. 65 as the output.
      
    }
}

// Rituraj Mahato
