//  GCD                    OR   HCF                     and LCM
// (Greatest Common Divisor)    (Highest Common factor)

// 1- way 
{
     a = 24 ; b = 36; gcd;
     min = a;
     if(a > b){
         min = b;
     }
     // loop ---> min to 2   (24 to 2)
     for(int i = min; i >= 2; i--){
         if(a%i == 0 && b%i == 0){
             gcd = i;
             break;
         }
     }
     print gcd;

      int lcm = a*b / gcd;
     print lcm;
}

// 2- way  more optimal code
{
    // loop ---> min/2 to 2   (12 to 2)
    for(int i = min/2; i >= 2; i--){
        if(a%i == 0 && b%i == 0){
            gcd = i;
            break;
        }
    }
}


// 2- way  more optimal code by using division method OR eulid method
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt() , n2 = scn.nextInt();

        int product = n1 * n2;
        while(n1%n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;

        int lcm =( product ) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}





////////////////////////////////////////////////////////////////////
// Gcd And Lcm
// Easy

// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers. 

// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers. 

// 3. Take input "num1" and "num2" as the two numbers. 

// 4. Print their GCD and LCM.


// Constraints
// 2 <= n <= 10^9

// Format
// Input
// num1
// num2
// .. the numbers whose GCD and LCM we have to find.

// Output
// a
// b
// .. where 'a' and 'b' are the GCD and LCM respectively.

// Example
// Sample Input

// 36
// 24

// Sample Output
// 12
// 72