import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    //data value
    int d = scn.nextInt();

    System.out.println(firstIdx(arr, d));
    System.out.println(lastIdx(arr, d));

    

    // // First Index 
    // int lo = 0;
    // int hi = arr.length-1;
    // int fidx = -1;
    // while(lo <= hi){
    //     int mid = (lo + hi)/2;
    //     if(d > arr[mid]){
    //      lo = mid + 1;
    //     }
    //     else if(d < arr[mid]){
    //      hi = mid - 1;
    //     }
    //     else{
    //         fidx = mid;
    //         hi = mid + 1;
    //     }
    // }
    // System.out.println(fidx);

     
    //  // Last Index
    // lo = 0;
    // hi = arr.length-1;
    // int sidx = -1;
    // while(lo <= hi){
    //     int mid = (lo + hi)/2;
    //     if(d > arr[mid]){
    //      lo = mid + 1;
    //     }
    //     else if(d < arr[mid]){
    //      hi = mid - 1;
    //     }
    //     else{
    //         sidx = mid;
    //         lo = mid - 1;
    //     }
    // }
    // System.out.println(sidx);
 
 }

  // arr : 1 2 2 2 3 4 , k = 2 
    public static int firstIdx(int arr[] ,int k){
        int left = 0 , right = arr.length-1;
        int idx = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == k){
                idx = mid;
                right = mid-1;
            }else if(k > arr[mid]){
                left = mid+1;
            }else if(k < arr[mid]){
                right = mid-1;
            }
        }
        return idx;
    }
    public static int lastIdx(int arr[] ,int k){
        int left = 0 , right = arr.length-1;
        int idx = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == k){
                idx = mid;
                left = mid + 1;
            }else if(k > arr[mid]){
                left = mid+1;
            }else if(k < arr[mid]){
                right = mid-1;
            }
        }
        return idx;
    }

}


/////////////////////////////////////////////////////////////////
// First Index And Last Index
// Easy

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.

// Asssumption - Array is sorted. Array may have duplicate values.

// Constraints
// 1 <= n <= 1000
// 1 <= n1, n2, .. n elements <= 100
// 1 <= d <= 100

// Format
// Input
// A number n
// n1
// n2
// .. n number of elements
// A number d

// Output
// A number representing first index
// A number representing last index

// Example
// Sample Input

// 15
// 1
// 5
// 10
// 15
// 22
// 33
// 33
// 33
// 33
// 33
// 40
// 42
// 55
// 66
// 77
// 33

// Sample Output
// 5
// 9