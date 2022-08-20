import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int r = n; r >= 1; r--){
           
            for(int c = r; c >= 1; c--){
                System.out.print("*\t");
            }
            System.out.println();

        }

    }
}


///////////////////////////////////////////////////////////////////
// Pattern 2
// Easy

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 100

// Format
// Input
// A number n

// Output
// pat21

// Example
// Sample Input

// 5

// Sample Output
// *	*	*	*	*	
// *	*	*	*	
// *	*	*	
// *	*	
// *