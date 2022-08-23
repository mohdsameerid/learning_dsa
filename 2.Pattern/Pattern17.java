import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int spaces = n/2;
        int stars = 1;
        for(int r = 1; r <= n; r++){

            // System.out.print(spaces+" "+stars);
            //spaces
            for(int i = 1; i <= spaces; i++){
                if(r == n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }   
            }
            //stars
            for(int i = 1; i <= stars; i++){
                System.out.print("*\t");
            }
            //prepration for the next Row
            if(r <= n/2){
                stars += 1;
            }
            else{
                stars -= 1;
            }

            System.out.println();
        }

    }
}