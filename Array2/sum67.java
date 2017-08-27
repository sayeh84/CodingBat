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
public class sum67 {
  public int sum67(int[] nums) {
    int sum = 0;
    boolean inRange = false;
      
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 6)
            inRange = true;

        if(!inRange)
            sum += nums[i];
                                        
        if(inRange && nums[i] == 7)
            inRange = false;
                                                        
    }
                                                            
    return sum;
}
   
}
