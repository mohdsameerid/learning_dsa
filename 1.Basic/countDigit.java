import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count = 0;

    while(n != 0){
      int temp = n;
      n = n/10;
      count++;
    }
    System.out.println(count);
   }
  }


  ///////////////////////////////////////////////////////////////////////

//   Count Digits In A Number
// Easy

// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

// Constraints
// 1 <= n < 10^9

// Format
// Input
// "n" where n is any integer.

// Output
// "d" where d is the number of digits in the number "n"

// Example
// Sample Input

// 65784383

// Sample Output
// 8