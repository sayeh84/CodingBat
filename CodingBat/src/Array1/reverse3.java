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
public class reverse3 {
   
public int[] reverse3(int[] nums) {
  
   if(nums.length==3){
  int sise = nums.length;
int temp;

for (int i = 0; i <sise/2; i++)
  {
     temp = nums[i];
    nums[i] = nums[sise-1 - i];
     nums[sise-1 - i] = temp;
  }
  }

  return nums;

} 
}
