import java.io.*;
import java.util.*;

public class SpanofArray{

 public static void main(String[] args) throws Exception { 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }

    int ans = spanOfArray(arr);
    System.out.println(ans);

 }
 public static int spanOfArray(int arr[]){
    //  int min = Integer.MAX_VALUE;
    //  int max = Integer.MIN_VALUE;
    int max = arr[0];
    int min = arr[0];
     for(int i = 0; i < arr.length; i++){
         if(arr[i] > max){
             max = arr[i];
         }
         if(arr[i] < min){
             min = arr[i];
         }
        //  System.out.print(min +" "+max);
     }
     return max-min;
 }
}

//////////////////////////////////////////////////////////////////

// Span Of Array
// Easy

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

// Constraints
// 1 <= n <= 10^4
// 0 <= n1, n2
//  .. n elements <= 10 ^9

// Format
// Input
// A number n
// n1
// n2
// .. n number of elements

// Output
// A number representing max - min

// Example
// Sample Input

// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Sample Output
// 36