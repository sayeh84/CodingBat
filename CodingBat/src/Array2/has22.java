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
public class has22 {
        public boolean has22(int[] nums) {
  
  
  
  for(int i=0; i<nums.length-1;i++){
       if( nums[i]==2 &&  nums[i+1] ==2 ){
           
        return true;
             
         }
        
  }
  
  
       
  
  
  return false;
}

}
