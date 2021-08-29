package bootcampjava;

import java.util.Arrays;

class Solution {
    public static int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        
        int s=0;
        int e = nums.length-1;
        
        while (s<=e){
        	
            int mid = s+e/2;
            
            if(target > nums[mid]){
                s = mid+1;
            } else if(target < nums[mid]) {
                 e = mid-1;
            }
            
            else {
                
                int i=0;
                while(i<2){
                    res[i++] = mid;
                }
                return res;   
             }
             
           
            
        }
        int a[] = {-1,-1};
        return a;
    }
    
  public static void main(String[] args) {
	  int[] nums = {5,7,7,8,8,10};
	  
	  System.out.println(Arrays.toString(searchRange(nums, 8)));
	  
	  
  }
}
