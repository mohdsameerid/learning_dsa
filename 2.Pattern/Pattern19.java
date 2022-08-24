import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int middle = n/2+1;

    for(int r = 1; r <= n; r++){
        for(int c = 1; c <= n; c++){

            if(r == 1){
                if((c <= middle) || (c == n)){
                    System.out.print("*");
                }
                System.out.print("\t");
            }

            else if(r > 1 && r < middle){
                if(c == n || c == middle){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }

            else if(r == middle){
                if(true){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }

            else if(r > n/2+1 && r < n){
                if(c == 1 || c == n/2+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }

            else if(r == n){
                if(c == 1 || c > n/2){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
        }
        //line change
        System.out.println();
    }

 }
}

///////////////////////////////////////////////////////////////////////

// Pattern 19
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
// pat191

// Example
// Sample Input

// 3

// Sample Output
*	*	*	
*	*	*	
*	*	*