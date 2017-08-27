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
public class lucky13 {
  public boolean lucky13(int[] nums) {
  
  for(int i=0; i<nums.length; i++){
      if(nums[i]==1 ||nums[i]==3 ){
          return false;
      }
   
  }
 
  
  
  return true;
}
  
}
