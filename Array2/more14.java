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
public class more14 {
    public boolean more14(int[] nums) {
  int a=0;
  int b= 0;
  for (int i=0; i< nums.length; i++){
    
    if(nums[i]==1){
      a++;
    }
      if(nums[i]==4){
      b++;
    }
    
  }
  
  
  return a>b;
  
}

}
