import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
        
        // digit count
        int count = 0;
        int temp = num;
        while(temp != 0){
            temp = temp / 10;
            count++;
        }
        //   System.out.println(count);
        
         // true rotation
        k = k % count;

        // negative rotation
        if(k < 0){
          k = k + count;
        }
        
        // making spliter 2 ways
        // 1-way
        // int sk = k;  
        // int spliter = 1;
        // while(sk != 0){
        //     spliter = spliter * 10;
            
        //     sk--;
        // }
        // 2-way
        int spliter = (int)Math.pow(10, k);

        // System.out.println(div);
        int p1 = num / spliter;
        int p2 = num % spliter;
        
        int mergerHelper = (int)Math.pow(10,count-k);
        // System.out.println(mergerHelper);
        int ans = ( p2 * mergerHelper ) + p1;
        System.out.println(ans);
        
    }
}

////////////////////////////////////////////////////////////////////
// Rotate A Number
// Easy

// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340

// Constraints
// 1 <= n < 10^9
// -10^9 < k < 10^9

// Format
// Input
// "n" where n is any integer.
// "K" where k is any integer.

// Output
// "r", the rotated number

// Example
// Sample Input

// 562984
// 2

// Sample Output
// 84562