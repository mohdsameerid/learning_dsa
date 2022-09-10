import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
        String ans = "";

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            // 'a' - LC = 'A' - UC
            if(ch >= 'a' && ch <= 'z'){
                char uc =(char)('A' + (ch -'a'));
                ans = ans + uc;
            }else if(ch >= 'A' && ch <= 'Z'){
                char lc =(char)('a' + (ch -'A'));
                ans = ans + lc;
            }
        }

        return ans;
    }
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}


/////////////////////////////////////////////////////////////////
// Toggle Optica Document
// Easy

// 1. There is an agreement document for JSCOP optica but by mistake, the case of every character in the string of document is a toggle so you need to correct it.

// 2. You are given a string of the document that contains only lowercase and uppercase alphabets. 

// 3. You have to toggle the case of every character of the given string.






// Constraints
// 1 <= length of string <= 1000


// Format
// Input
// A String


// Output
// A String


// Example
// Sample Input

// pepCODinG

// Sample Output
// PEPcodINg