import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        // spiral
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt() , nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat[i][j] = scn.nextInt();
            }
        }     
        spiralDisplay(mat);
    }

    public static void spiralDisplay(int mat[][]){
        int rmin = 0, cmin = 0, rmax = mat.length-1, cmax = mat[0].length-1;
        int tne = mat.length * mat[0].length;
        int count = 0;
        while(count < tne){
            // left wall
            for(int r = rmin, c = cmin ; r <= rmax && count < tne; r++){
                System.out.println(mat[r][c]);
                count++;    
            }
            // bottom wall
            for(int r = rmax, c = cmin+1 ; c <= cmax && count < tne ; c++){
                System.out.println(mat[r][c]);
                count++;
            }
            // right wall
            for(int r = rmax-1, c = cmax ; r >= rmin && count < tne; r--){
                System.out.println(mat[r][c]);
                count++;
            }
            // top wall
            for(int r = rmin, c = cmax-1 ; c >= cmin+1 && count < tne ; c--){
                System.out.println(mat[r][c]);
                count++;
            }
            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }
    }

}



////////////////////////////////////////////////////////////////

// Spiral Display
// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// -10^9 <= e1, e2, .. n * m elements <= 10^9

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
// e11
// e21
// ..
// en1
// en2
// en3
// ..
// enm
// e(n-1)m
// ..
// e1m
// e1(m-1)
// ..
// e12
// e22
// e32
// ..

// Example
// Sample Input

// 3
// 5
// 11
// 12
// 13
// 14
// 15
// 21
// 22
// 23
// 24
// 25
// 31
// 32
// 33
// 34
// 35

// Sample Output
// 11
// 21
// 31
// 32
// 33
// 34
// 35
// 25
// 15
// 14
// 13
// 12
// 22
// 23
// 24