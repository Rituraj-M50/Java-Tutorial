import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
 
//       Nested Switch Statements in Java
      
        Scanner input = new Scanner(System.in);
      
        int empID = input.nextInt();
        String department = input.next();
      
//       Here, We would be having a Switch Statement within a Switch Statement.

       switch (empID) {
           case 1:
               System.out.println("Rituraj Mahato");
               break;
           case 2:
               System.out.println("Rohan Sebastian");
               break;
           case 3:
               System.out.println("Employee No. 3");
               switch (department) {
                   case "IT":
                       System.out.println("IT Department");
                       break;
                   case "Management":
                       System.out.println("Management Department");
                       break;
                   default:
                       System.out.println("No Department");
                       break;
               }
               break;
           default:
               System.out.println("Enter correct empID");
               break;
       }
      
//       Note - break is quite important here, to get out of the loop.

//       Enhanced Nested Switch Statements in Java

        switch (empID) {
            case 1 -> System.out.println("Rituraj Mahato");
            case 2 -> System.out.println("Rohan Sebastian");
            case 3 -> {
                System.out.println("Employee No. 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}

// Rituraj Mahato
