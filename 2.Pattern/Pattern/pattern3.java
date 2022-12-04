import java.util.*;
public class pattern3 {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int spaces = n;
      int stars = 1;
      for(int r = 1; r <= n/2+2; r++){
          //spaces
          for(int i = 1; i <= spaces; i++){
              System.out.print("_");
          }
          //stars
          for(int i = 1; i <= stars; i++){
              System.out.print("@");
          }
          //next line 
          System.out.println();
          //prepration for the next row
          spaces--;
          stars += 2;
      }
      spaces++;
      stars -= 2;
      
      int star = stars;
      // next module 
      for(int r = 1; r <= n; r++){
        // spaces
        for(int i = 1; i <= spaces; i++){
            System.out.print("1");
        }
        //star
        for(int i = 1; i <= star; i++){
            if(r == n/2+1){
               // do something for @
            }
            System.out.print("*");
        }
        //line change
        System.out.println();
        //prepration for next row
            if(r <= n/2){
                spaces--;
                star += 2;
            }
            else{
                star -= 2;
                spaces++;
            }
        }
      
    }
}








