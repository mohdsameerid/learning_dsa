// printing left Diagonal --> (row == column) 
// printing right Diagonal --> ((row +column) == (n+1)
// where the n is , input that take from user

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= n; c++){
                if(r==c || r+c == n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
           System.out.println(); 
        }

    }
}

/////////////////////////////////////////////////////////////////////
// Pattern 9
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
// pat91

// Example
// Sample Input

// 5

// Sample Output
// *				*	
// 	*		*		
// 		*			
// 	*		*		
// *				*