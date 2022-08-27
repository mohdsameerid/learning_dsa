import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int arr[][] = new int[n][m];
    fillMatrix(arr, scn);
    display(arr);

    // int arr[][] = new int[n][m];
    // for(int i = 0; i < n; i++){
    //   for(int j = 0; j < n; j++){
    //     arr[i][j] = scn.nextInt();
    //   }
    // }

    // //printing 2d array
    // for(int i = 0; i < arr.length; i++){ //row loop
    //   for(int j = 0; j < arr[0].length; j++){ //column loop
    //      System.out.print(arr[i][j] + " ");
    //   }
    //   System.out.println();
    // }
   }

   public static void fillMatrix(int mat[][],Scanner scn){
        int nr = mat.length;
        int nc = mat[0].length;
        for(int r = 0 ; r < nr ; r++){
            for(int c = 0 ; c < nc ; c++){
                mat[r][c] = scn.nextInt();
            }
        }
    }
    public static void display(int mat[][]){
        int nr = mat.length;
        int nc = mat[0].length;
        for(int r = 0 ; r < nr ; r++){
            for(int c = 0 ; c < nc ; c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
  }


  ///////////////////////////////////////////////////////

//   2d Arrays Demo
// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to display the contents of 2d array as suggested by output format below.

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
// e11 e12 e13 ..
// e21 e22 e23 ..

// Example
// Sample Input

// 2
// 4
// 11
// 12
// 13
// 14
// 21
// 22
// 23
// 24

// Sample Output
// 11 12 13 14
// 21 22 23 24