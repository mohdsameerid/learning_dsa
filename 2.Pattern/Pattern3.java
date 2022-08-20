import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // setting variable for spaces and stars
        int spaces = n -1;
        int stars = 1;
        for(int r = 1; r <= n; r++){
            System.out.print(spaces+"\t"+stars); // printing Spaces val and Stars Val.

            System.out.println(); // Line Change 

            //setting up values for the next Row
            spaces--;
            stars++;
        }

    }
}