import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
        
        // digit count
        int count = 0;
        int temp = num;
        while(temp != 0){
            temp = temp / 10;
            count++;
        }
        //   System.out.println(count);
        
         // true rotation
        k = k % count;

        // negative rotation
        if(k < 0){
          k = k + count;
        }
        
        // making spliter 2 ways
        // 1-way
        // int sk = k;  
        // int spliter = 1;
        // while(sk != 0){
        //     spliter = spliter * 10;
            
        //     sk--;
        // }
        // 2-way
        int spliter = (int)Math.pow(10, k);

        // System.out.println(div);
        int p1 = num / spliter;
        int p2 = num % spliter;
        
        int mergerHelper = (int)Math.pow(10,count-k);
        // System.out.println(mergerHelper);
        int ans = ( p2 * mergerHelper ) + p1;
        System.out.println(ans);
        
    }
}