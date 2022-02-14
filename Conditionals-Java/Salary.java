public class Conditionals {

    public static void main(String[] args) {
        
//        Simple if and else statements

        int salary = 25600;
        if (salary > 10000){
            salary = salary + 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);

//       Multiple if, else if and else statements

        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 4000;
        } else if (salary > 25000) {
            salary += 5000;
        } else {
            salary += 1200;
        }
        System.out.println(salary);
    }
}

// Rituraj Mahato
