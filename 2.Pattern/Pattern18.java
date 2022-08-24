import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int spaces = 0;
    int stars = n;
    for(int r = 1; r <= n; r++){
        //spaces
        for(int i = 1; i <= spaces; i++){
            System.out.print("\t");
        }
        // stars
        for(int i = 1; i <= stars; i++){
            if((r > 1 && r < n/2+1) && (i > 1 && i < stars)){
                System.out.print("\t");
            }
            else{
                System.out.print("*\t");
            }
        }
        //prepration for next row
        if(r <= n/2){
            spaces++;
            stars -= 2;
        }else{
            spaces--;
            stars += 2;
        }
        // line change
        System.out.println();
    }

 }
}

/////////////////////////////////////////////////////////////////
// Pattern 18
// Easy

// 1. You are given a number n.
//       2. You've to write code to print the pattern given in output format below

// Constraints
// 1 <= n <= 10
//  Also, n is odd.

// Format
// Input
// A number n

// Output
// pat181

// Example
// Sample Input

// 7

// Sample Output
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*