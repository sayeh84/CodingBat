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
public class countEvens {
    public int countEvens(int[] nums) {

  int j=0;
  for(int i=0 ; i< nums.length; i++){
    
    if(nums[i]  % 2 == 0){
      j++;
    }
  }
  
  
  return j;
  
}
}
