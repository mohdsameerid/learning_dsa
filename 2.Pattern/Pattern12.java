import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int fval = 0;
        int sval = 1;
        int thval;
        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= r; c++){
                System.out.print(fval+"\t");
                thval = fval + sval;
                
                fval = sval;
                sval = thval;

            }
            System.out.println();
        }

    }
}


////////////////////////////////////////////////////////////////
// Pattern 12
// Easy

// 1. You are given a number n.
// 2. You've to create a pattern as shown in output format.

// Constraints
// 1 <= n <= 5

// Format
// Input
// A number n

// Output
// pat121

// Example
// Sample Input

// 5

// Sample Output
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377