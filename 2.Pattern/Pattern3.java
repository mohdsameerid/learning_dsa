import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // setting variable for spaces and stars
        int spaces = n -1;
        int stars = 1;
        // for(int r = 1; r <= n; r++){
        //     System.out.print(spaces+"\t"+stars); // printing Spaces val and Stars Val.

        //     System.out.println(); // Line Change 

        //     //setting up values for the next Row
        //     spaces--;
        //     stars++;
        // }

        for(int r = 1; r <= n; r++){
            //spaces loop
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            //stars loop
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            //line change
            System.out.println();

          //prepration for the next row
          spaces--;
          stars++;  
        }
    }
}