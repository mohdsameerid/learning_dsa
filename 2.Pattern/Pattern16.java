import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int stars = 1;
    int spaces = n * 2 - 3;

    for(int r = 1; r <= n; r++){
        int val = 1;
        //stars
        for(int i = 1; i <= stars; i++){
            System.out.print(val+"\t");
            val++;
        }
        //spaces
        for(int i = 1; i <= spaces; i++){
            System.out.print("\t");
        }

        if(r == n){  // for last extra * remove
            stars--;
            val--;
        }
        //stars
        for(int i = 1; i <= stars; i++){
            val--;
            System.out.print(val+"\t");
        }
        //preration for the next row
         stars++;
         spaces -= 2;
        //line change
        System.out.println();
    }

 }
}



/////////////////////////////////////////////////////////////////////////
// Pattern 16
// Easy

// 1. You are given a number n.
//       2. You've to write code to print the pattern given in output format below

// Constraints
// 1 <= n <= 10

// Format
// Input
// A number n

// Output
// pat161

// Example
// Sample Input

// 7

// Sample Output
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1