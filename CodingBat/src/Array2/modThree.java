/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array2;

/**
 *
 * @author sayeh
 */
public class modThree {
   



 



public boolean modThree(int[] nums) {
  
  for(int i=0; i<nums.length-2; i++){
      if (nums[i]  % 2 == 0 && nums[i+1]  % 2 == 0&& nums[i+2]  % 2 == 0) {
        
         return true;
  } 
   
    
    else if ((nums[i]  & 1) != 0 &&(nums[i+1]  & 1) != 0&& (nums[i+2]  & 1) != 0 ) {
        
         return true;
  } 
    
  }
  
  return false;
  
 
}

    
}
