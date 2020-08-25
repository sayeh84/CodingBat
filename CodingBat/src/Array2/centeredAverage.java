/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array2;

import java.util.Arrays;

/**
 *
 * @author sayeh
 */
public class centeredAverage {
 public int centeredAverage(int[] nums) {
  
  int average=0;
  
 
   Arrays.sort(nums);
 if(nums.length>=3);
  if(nums.length  % 2 == 0){
     average = (nums[(nums.length/2)-1]+nums[(nums.length/2)])/2;
  }
  else{
    average = nums[nums.length/2];
  }
  
  
  
  
  return average;
  
}   
}
