import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
//       Switch Statements in Java Programming
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Red Sweet Fruit");
                break;
            case "Banana":
                System.out.println("Full of Calcium and Potassium");
                break;
            case "Grapes":
                System.out.println("Small Fruit");
                break;
            case "Orange":
                System.out.println("Full of Vitamin C");
                break;
            default:
                System.out.println("Please enter a valid fruit !");
        }
        
//      Enhanced Switch Statements in Java Programming
        
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Red Sweet Fruit");
            case "Banana" -> System.out.println("Full of Calcium and Potassium");
            case "Grapes" -> System.out.println("Small Fruit");
            case "Orange" -> System.out.println("Full of Vitamin C");
            default -> System.out.println("Please enter a valid fruit !");
        }
      
//      Let's take another example -
        
        int day = in.nextInt();
        
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}

// Rituraj Mahato
