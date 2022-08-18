// 1-brutt force method
for (int div = 2; div <= n-1; div++){

}


// 2- little optimal way
for(int div = 2; div <= n/2; div ++){

}

// 3- more optimized way
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
      int t = scn.nextInt();

      while(t != 0){
        int n = scn.nextInt();
        
        boolean isprime = true;
        for(int div = 2 ; div*div <= n ; div++){
          if(n%div == 0){
            // factor
            isprime = false;
            break;
          }
        }
        if(isprime){
          System.out.println("prime");
        }else{
          System.out.println("not prime");
        }
        t--;
      }
  
   }
  }



  /////////////////////////////////////////////////////////////////
//   Is A Number Prime
//   Easy
  
//   1. You've to check whether a given number is prime or not.
//   2. Take a number "t" as input representing count of input numbers to be tested.
//   3. Take a number "n" as input "t" number of times.
//   4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
  
//   Constraints
//   1 <= t <= 10000
//   2 <= n < 10^9
  
//   Format
//   Input
//   A number t
//   A number n
//   A number n
//   .. t number of times
  
//   Output
//   prime
//   not prime
//   not prime
//   .. t number of times
  
//   Example
//   Sample Input
  
//   5
//   13
//   2
//   3
//   4
//   5
  
//   Sample Output
//   prime
//   prime
//   prime
//   not prime
//   prime