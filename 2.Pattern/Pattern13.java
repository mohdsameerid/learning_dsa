import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // 6 

        for(int i = 0; i < n; i++){ //0 1 2 3 4 5 
        int icj = 1;
            for(int j = 0; j <= i; j++){ // 0 1 2 3 4 5 6
                System.out.print(icj +"\t");
                int icjp1 = icj * (i - j) / (j+1);
                icj = icjp1;
            }
           System.out.println(); 
        }

    }
}

//////////////////////////////////////////////////////////////////
// Pattern 13
// Easy

// 1. You are given a number n.
// 2. You've to create a pattern as shown in output format

// Constraints
// 1 <= n <= 10

// Format
// Input
// A number n

// Output
// pat131

// Example
// Sample Input

// 5

// Sample Output
// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1