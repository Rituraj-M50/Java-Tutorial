public class parameters {
    public static void main(String[] args) {
      
//      Here, 20 and 30 are the arguments of the method add.
      
        int ans = add(20,30);
      
//      The method (add) will return 'sum' which will be assigned to the int variable 'ans'.
      
        System.out.println(ans);
    }
 
//   int a and int b are the parameters of the method (add).
  
    static int add (int a, int b) {
        int sum = a + b;
      
//   We have to return the value of sum to make it a global variable.
      
        return sum;
    }
}

// Rituraj Mahato
