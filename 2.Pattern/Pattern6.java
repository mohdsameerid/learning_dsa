import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int stars = n/2 + 1;
        int spaces = 1;
        // n should be ODD.
        for(int r = 1; r <= n; r++){
            // System.out.print(stars+" "+spaces+" "+stars);
            //stars
              for(int i = 1; i <= stars; i++){
                  System.out.print("*\t");
              }
            //spaces
            for(int i = 1; i <= spaces; i++){
                System.out.print("\t");
            }
            //stars
            for(int i = 1; i <= stars; i++){
                System.out.print("*\t");
            }
            //line change
            System.out.println();

            //prepration for next row
              if(r <= n/2){
                  stars--;
                  spaces += 2; 
              }
              else{
                  stars++;
                  spaces -= 2; 
              }

        }
    }
}


/////////////////////////////////////////////////////////////////////

// Pattern 6
// Easy

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 100
//  Also, n is odd.

// Format
// Input
// A number n

// Output
// pat61

// Example
// Sample Input

// 5

// Sample Output
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*