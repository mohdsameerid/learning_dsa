import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int spaces = n/2;
        int stars = 1;
        for(int r = 1; r <= n; r++){
            // System.out.print(spaces+ "\t"+stars);
            // spaces loop
            for(int i = 1; i <= spaces; i++){
                System.out.print("\t");
            }
            //stars loop
            for(int i = 1; i <= stars; i++){
                System.out.print("*\t");
            }

            // preration for next row
            if(r <= n/2){
                spaces--;
                stars += 2;
            }else{
                spaces++;
                stars -= 2;
            }

            // line change 
            System.out.println();
        }
    }
}

/////////////////////////////////////////////////////////////////////
// Pattern 5
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
// pat51

// Example
// Sample Input

// 5

// Sample Output
//          *	
//	    *	*	*	
//  *	*	*	*	*	
//	    *	*	*	
// 		    *	