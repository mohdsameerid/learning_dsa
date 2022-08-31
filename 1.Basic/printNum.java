import java.util.ArrayList;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]){
    Scanner scn  = new Scanner(System.in);
    
    int m = scn.nextInt();
    
    int rem = 0;
    int rev = 0;
    
    while(m != 0){
        rem = m % 10;
        rev = rev * 10 + rem;
        m = m / 10;
    }
    System.out.println(rev);
    while(rev != 0){
        int rem1 = rev % 10;
        System.out.println(rem1);
        rev = rev /10;
    }
    // System.out.println(rev);
    }
}    
    
////////////////////////////////////////////////////////
// input --> 5777555
output --> 
5557775
5
7
7
7
5
5
5