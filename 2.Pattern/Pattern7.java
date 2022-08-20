import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= n; c++){
                if(r == c){
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

//////////////////////////////////////////////////////////////////
// Pattern 7
// Easy

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 100

// Format
// Input
// A number n

// Output
// pat71

// Example
// Sample Input

// 5

// Sample Output
// *	
// 	*	
// 		*	
// 			*	
// 				*