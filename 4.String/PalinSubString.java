import java.io.*;
import java.util.*;

public class Main {

	public static boolean ispalindrome(String str){
		int left = 0;
		int right = str.length()-1;

		while ( left < right ) {
			if(str.charAt(left) != str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void solution(String str){
		for(int i = 0; i < str.length(); i++){
			for(int j = i+1; j <= str.length(); j++){
				String subStr = str.substring(i,j);

				if(ispalindrome(subStr)){
					System.out.println(subStr);
				}
			}
		}		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}



////////////////////////////////////////////////////////////
// Print All Palindromic Substrings
// Easy

// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.

// Constraints
// 1 <= length of string <= 500

// Format
// Input
// A String

// Output
// All palindromic substrings(one in a line).
// First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

// Example
// Sample Input

// abcc

// Sample Output
// a
// b
// c
// cc
// c