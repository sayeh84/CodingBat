/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array1;

/**
 *
 * @author someya.sayeh
 */
public class maxEnd3 {
  public int[] maxEnd3(int[] nums) {
    
    int[] newMuns= new int[3];
    int max = Math.max(nums[0], nums[2]);
   
  for(int i= 0; i<nums.length; i++){
      
      int neki = max;
      newMuns[i]=neki;
        
    }
    
  return newMuns;
      
  }  
}
