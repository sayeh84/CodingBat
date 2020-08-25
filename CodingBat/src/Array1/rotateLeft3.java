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
public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {

   if(nums.length==3){
    nums = new int []   {nums[1],nums[2],nums[0] };
    
  }

  return nums;
  
}
}
