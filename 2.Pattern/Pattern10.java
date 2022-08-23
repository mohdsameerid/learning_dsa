import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int outterSp = n/2;
    int innerSp = -1;
    for(int r = 1; r <= n; r++){
        
        // outter Space loop
        for(int i = 1; i <= outterSp; i++){
            System.out.print("\t");
        }
        // Star print
        System.out.print("*\t");

        // inner Space loop
        for(int i = 1; i <= innerSp; i++){
            System.out.print("\t");
        }
        //stars not to print in 1 and 5 if n is 5
        if(r > 1 && r < n){
            System.out.print("*\t");
        }
        //prepration for the next row
        if(r <= n/2){
            outterSp--;
            innerSp += 2;
        }
        else{
            outterSp++;
            innerSp -= 2;
        }
        //line change
        System.out.println();
    }

 }
}

///////////////////////////////////////////////////////////////////////

// Pattern 10
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
// pat101

// Example
// Sample Input

// 5

// Sample Output
		*	
	*		*	
*				*	
	*		*	
		*	