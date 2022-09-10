import java.util.Scanner;
public class SubString{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        substring(str);
    }

    // str = "abcd";
    // [ i    to length-1]
    // [j=i+1 to length]

    public static void substring(String str){
        for(int i = 0; i < str.length(); i++){

            for(int j = i+1; j <= str.length(); j++){
                String substr = str.substring(i,j);
                System.out.println(substr);
            }
            
        }
    }
}