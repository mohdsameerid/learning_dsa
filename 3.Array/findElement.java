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