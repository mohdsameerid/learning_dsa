//  GCD                    OR   HCF                     and LCM
// (Greatest Common Divisor)    (Highest Common factor)

// 1- way 
{
     a = 24 ; b = 36; gcd;
     min = a;
     if(a > b){
         min = b;
     }
     // loop ---> min to 2   (24 to 2)
     for(int i = min; i >= 2; i--){
         if(a%i == 0 && b%i == 0){
             gcd = i;
             break;
         }
     }
     print gcd;

      int lcm = a*b / gcd;
     print lcm;
}

