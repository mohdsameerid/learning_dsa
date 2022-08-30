
// program to print * like this-->
//  n = 5  
*	*	*	
	*	*	
		*	
	*	*	
*	*	*
// n = 7
*	*	*	*	
	*	*	*	
		*	*	
			*	
		*	*	
	*	*	*	
*	*	*	*
 

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int spaces = 0;
      int stars = n/2 + 1;
      for(int i = 0; i < n; i++){
        //   System.out.print(spaces + " "+ stars);
          
          //spaces 
          for(int j = 1; j <= spaces; j++){
              System.out.print("\t");
          }
          //stars
          for(int j = 1; j <= stars; j++){
              System.out.print("*\t");
          }
          if( i < n/2){
          spaces++;
          stars--;
          }
          else{
              spaces--;
              stars++;
          }
          
          System.out.println();
      }
    }
}