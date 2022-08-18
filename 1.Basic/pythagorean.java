import java.util.*;
  
  public class Main {
  
  	  public static void main(String[] args) {
  	  	//   Write your code here
			// System.out.println("Enter three Numbers: A B C...");
			Scanner scn = new Scanner(System.in);
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = scn.nextInt();

			int max = a;
			if(b >= max){
				max = b;
			}
			if(c >= max){
				max = c;
			}

			if(a == max){
				System.out.println((a*a) == ((b*b) + (c*c)));
			}
			if(b == max){
				System.out.println((b*b) == ((a*a) + (c*c)));
			}
			if(c == max){
				System.out.println((c*c) == ((a*a) + (b*b)));
			}

  	  }
  }



  ///////////////////////////////////////////////////////////
//   Pythagorean Triplet
// Easy

// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.

// Constraints
// 1 <= a <= 10^9
// 1 <= b <= 10^9
// 1 <= c <= 10^9

// Format
// Input
// a, an integer
// b, an integer
// c, an integer

// Output
// true if the numbers form a pythagorean triplet and false otherwise

// Example
// Sample Input

// 5 3 4

// Sample Output
// true