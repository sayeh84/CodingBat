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
public class maxTriple {
    public int maxTriple(int[] nums) { 
  int max=0;
  if(nums.length>1){
   int midMax= Math.max(nums[0], nums[nums.length-1]);
   max=  Math.max(nums[nums.length/2], midMax);
      
  }
      return max;
  
}
}
