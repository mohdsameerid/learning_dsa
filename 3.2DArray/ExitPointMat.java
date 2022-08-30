import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int arr[][] = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        exitpoint(arr);

    }

    public static void exitpoint(int arr[][]){
        int nr = arr.length;
        int nc = arr[0].length;
        
        // store answer
        int ansRow = 0;
        int ansCol = 0;
        
        int r = 0, c = 0, dir = 0;
        while(!(r < 0 || c < 0 || r >= nr || c >= nc)){
            //direction
            dir = (dir + arr[r][c]) % 4;

            // for storing previous answer
            ansRow = r;
            ansCol = c;

            if(dir == 0){ // move east
                c++;
            }
            else if(dir == 1){ // move south
                r++;
            }
            else if(dir == 2){ // move west
                c--;
            }
            else{              // move north
                r--;
            }

        } 

        System.out.println(ansRow);
        System.out.println(ansCol);
    }
}



////////////////////////////////////////////////////////////////////
// Exit Point Of A Matrix
// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// e1, e2, .. n * m elements belongs to the set (0, 1)

// Format
// Input
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements

// Output
// row
// col (of the point of exit)

// Example
// Sample Input

// 4
// 4
// 0
// 0
// 1
// 0
// 1
// 0
// 0
// 0
// 0
// 0
// 0
// 0
// 1
// 0
// 1
// 0

// Sample Output
// 1
// 3