import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1;
        int spaces = n/2;
        int val = 1;
        
        for(int r = 1; r <= n; r++){
            // System.out.print(spaces+" "+stars);
            //spaces
            for(int i = 1; i <= spaces; i++){
                System.out.print("\t");
            }
            
            int cval = val;
            // stars
            for(int i = 1; i <= stars; i++){
                System.out.print(cval + "\t");
                if(i <= stars/2){
                    cval++;
                }
                else{
                    cval--;
                }
                // cval++;
            }

            //prepration for next row
            if(r <= n/2){
                stars += 2;
                spaces--;
                val++;
               
            } 
            else{
                stars -= 2;
                spaces++;
                val--;
            }
            
            //line change
            System.out.println();
        }

    }
}



///////////////////////////////////////////////////////////////////
// Pattern 15
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
// pat151

// Example
// Sample Input

// 5

// Sample Output
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	