import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int a1[] = new int[n1];
    // a1 bhara
    for(int i = 0; i < a1.length; i++){
        a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int a2[] = new int[n2];
    //a2 bhara
    for(int i = 0; i < a2.length; i++){
        a2[i] = scn.nextInt();
    }
    // sum banaya do bada ho A1,A2 ke size me
    int sum[] = new int[(n1 > n2) ? n1 : n2];

    int i = a1.length-1;
    int j = a2.length-1;
    int k = sum.length-1;
    int c = 0; // carry intilize for First Time

    while ( k >= 0 ) {
        int d = c;

        // a1 me value hai 
        if(i >= 0){
            d = d + a1[i];
        }
        // a2 me value hai 
        if(j >= 0){
            d = d + a2[j];
        }

        c = d / 10; // get carry
        d = d % 10; // get digit
        sum[k] = d; // add digit in sum    order(k to 0)

        // index changing 
        i--;
        j--;
        k--;
    }

    //agar carry 0 nahi hai to print karo
    if(c != 0){
        System.out.println(c);
    }
    // all array print
    for(int val: sum){
        System.out.println(val);
    }

 }

}


/////////////////////////////////////////////////////////////////
// Sum Of Two Arrays
// Easy

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the
// arrays.

// Constraints
// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10

// Format
// Input
// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Output
// A number representing sum of two numbers, represented by two arrays.

// Example
// Sample Input

// 5
// 3
// 1
// 0
// 7
// 5
// 6
// 1
// 1
// 1
// 1
// 1
// 1

// Sample Output
// 1
// 4
// 2
// 1
// 8
// 6