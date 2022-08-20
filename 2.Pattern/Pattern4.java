import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         
        int spaces = 0;
        int stars = n ;
        for(int r = 1; r <= n; r++){
            // System.out.print(spaces+"\t"+stars);
            //spaces 
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            //stars 
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            //line change
            System.out.println();

           spaces++;
           stars--;
        }

    }
}


///////////////////////////////////////////////////////////////////
// Pattern 4
// Easy

// 1. You are given a number n. 2. You've to create a pattern of * and separated by tab as shown in output format.


// Constraints
// 1 <= n <= 100

// Format
// Input
// A number n

// Output
// pat41

// Example
// Sample Input

// 5

// Sample Output	
// 	*	*	*	*	*
// 		*	*	*	*
// 			*	*	*
// 				*   *
//                  *