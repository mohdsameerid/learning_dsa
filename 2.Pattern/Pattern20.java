import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= n; c++){

                if(c == 1 || c == n){
                    System.out.print("*\t");
                }
                else if( r > n/2 ){
                    if(r == c || r+c == n+1)
                       System.out.print("*\t");                    
                    else
                        System.out.print("\t");  
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }
}

////////////////////////////////////////////////////////////////////
// Pattern 20
// Easy

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.

// Constraints
// 1 <= n <= 10
//  Also, n is odd.

// Format
// Input
// A number n

// Output
// pat201

// Example
// Sample Input

// 5

Sample Output
*				*	
*				*	
*		*		*	
*	*		*	*	
*				*