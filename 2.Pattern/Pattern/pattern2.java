import java.util.*;
public class pattern2 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if( (i < n/2 && j <= i) || (i > n/2 && j < n-i) || (i == n/2) ) 
                System.out.print("*");
                else
                System.out.print(" ");
            }
            if((i == n/2-1) || (i == n/2+1))
             System.out.print(" *");
            if(i == n/2)
             System.out.print("***");
            // System.out.print("1");
            System.out.print("\n");
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////
// output
// *        
// **       
// ***      
// ****      *
// ************
// ****      *
// ***      
// **       
// *    