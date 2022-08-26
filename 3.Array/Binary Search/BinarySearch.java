public class MyClass {
    public static void main(String args[]) {
        
        int nums[] = {10,20,30,40,50,60,70,80,90};
        int target = 200;
        int l = 0;
        int h = nums.length-1;
        int d = target;
        
        while(l <= h){
            int mid = (l + h)/2;
            
            if(d > nums[mid]){
                l = mid+1;
            }
            else if(d < nums[mid]){
                h = mid-1;
            }
            else{
                System.out.print(mid);
                return;
            }
        }
        System.out.print("-1");
   }
}



/////////////////////Question/////////////////////////////////
// leetcode 
// https://leetcode.com/problems/binary-search/submissions/