import java.lang.reflect.Array;
import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
      
//      Overloading allows different methods to have the same name,
//      but different signatures where the signature can differ by the number of input parameters or type of input parameters or both.
      
        fun(12);
//      In the above, Method 1 would be used as int input is taken.
      
        fun("Rituraj");
//      In the above, Method 2 would be used as String input is taken.
      
        int res1 = sum(1,2);
//      In the above, Method 3 would be used as there are two int inputs.
      
        System.out.println(res1);
      
        int res2 = sum(2,4,6);
//      In the above, Method 4 would be used as there are three int inputs.
      
        System.out.println(res2);
    }
  
//   Method 1 -

    static void fun(int a){
        System.out.println(a);
    }
  
//   Method 2 -
  
    static void fun(String name){
        System.out.println(name);
    }
  
  
//   Method 3 -

    static int sum(int a, int b){
        return a + b;
    }
  
//   Method 4 -
  
    static int sum(int a, int b, int c){
        return a + b + c;
    }
}

// To use somethong outside the local scope of the method, we have to mention the datatype instead of void.

// Rituraj Mahato
