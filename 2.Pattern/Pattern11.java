import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // 1 way
        int val = 1;
        // for(int r = 1; r <= n; r++){
        //     for(int c = 1; c <= r; c++){
        //         System.out.print(val+"\t");
        //         val++;
        //     }
        //     System.out.println();
        // }

        //2 way 
        int stars = 1;
        for(int r = 1; r <= n; r++){
            // stars/val 
            for(int i = 1; i <= stars; i++){
                System.out.print(val+"\t");
                val++;
            }
            //prepration for the next row
            stars++;
            //line change 
            System.out.println();
        }

    }
}


///////////////////////////////////////////////////////////////////
// Pattern 11
// Easy

// 1. You are given a number n. 2. You've to create a pattern as shown in output format.


// Constraints
// 1 <= n <= 44

// Format
// Input
// A number n

// Output
// pat111

// Example
// Sample Input

// 5

// Sample Output
// 1	
// 2	3	
// 4	5	6	
// 7	8	9	10	
// 11	12	13	14	15

