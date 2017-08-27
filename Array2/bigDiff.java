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
public class bigDiff {
  public int bigDiff(int[] nums) {
  int sum=0;
  if(nums.length >=1){
          Arrays.sort(nums);
          
     sum = nums[nums.length-1] -  nums[0];  
          
          
          
  }
  
return sum;
  
}
  
}
