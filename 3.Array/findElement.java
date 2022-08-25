import java.io.*;
import java.util.*;

public class findElement{

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];

       for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
       }
    }
    //cheching num d
    int d = scn.nextInt();
    int ans = findIdx(arr, d);
    System.out.println(ans);


    public static int findIdx(int arr[], int val){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }

}


////////////////////////////////////////////////////////////////////////


// Find Element In An Array
// Easy

// 1.You are given a number n, representing the size of array a.
// 2.You are given n distinct numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

// Constraints
// 1 <= n <= 10^7
// -10^9 <= n1, n2 
// .. n elements <= 10^9
// -10^9 <= d <= 10^9

// Format
// Input
// A number n
// n1
// n2
// .. n number of elements
// A number d

// Output
// A number representing index at which d is found in array a and -1 if not found

// Example
// Sample Input

// 6
// 15
// 30
// 40
// 4
// 11
// 9
// 40

// Sample Output
// 2