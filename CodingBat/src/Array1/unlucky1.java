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
public class unlucky1 {
    public boolean unlucky1(int[] nums) {
  if(nums.length >=3){
    for(int i=0; i<1; i++ ){
           if(nums[i]==1 && nums[i+1]==3 ) {
               return true;
           }
        else  if(nums[1]==1 && nums[2]==3 ) {
               return true;
           }
       
           else  if(nums[nums.length-2 ]==1 && nums[nums.length-1 ]==3 ) {
               return true;
           }
     
    }}
  else if(nums.length ==2){
  
      if(nums[0]==1 && nums[1]==3 ) {
               return true;
           }
    
    }

    return false;
}

}
