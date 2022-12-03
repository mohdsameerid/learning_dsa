import java.util.*;
public class pattern1 {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int loprun = n/2+1;
      int spaces = n/2;
      int stars = n;
      for(int r = 1; r <= loprun; r++){
          //spaces
          for(int i = 1; i <= spaces; i++){
              System.out.print(" ");
          }
          //stars
          for(int i = 1; i <= stars; i++){
              System.out.print("@");
          }
          //nextline
          System.out.println();
          //prepration for the next row
          spaces++;
          stars -= 2;
      }
      
      // for next module stars
      for(int i = 1; i <= n; i++){
          for(int j = 1; j <= n; j++){
              if(j == 1 || j == n || i == 1){
                  System.out.print("@");
              }
              else{
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
    }
}

///////////////////////////////////////////////////////////////////////////////////
// output for n = 7
//    @@@@@@@
//     @@@@@
//      @@@
//       @
// @@@@@@@
// @     @
// @     @
// @     @
// @     @
// @     @
// @     @