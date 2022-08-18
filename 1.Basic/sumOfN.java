// Two ways to do this 
// Wrong approch because of the n time its calulate 
public class MyClass {
    public static void main(String args[]) {
      int n= 5;
      int sum = 0; 
      for(int i = 1; i <= n; i++){
          sum = sum + i;
      }
      System.out.println("Sum of n is : " + sum);
    }
}


// Right Approch because of the mathmatical formula
public class MyClass {
    public static void main(String args[]) {
      int n= 5;
      int sum = (n*(n+1))/2;
      System.out.println("Sum of n is : " + sum);
    }
}