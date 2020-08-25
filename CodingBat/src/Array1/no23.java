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
public class no23 {
    public boolean no23(int[] nums) { 
 if(nums[0]==2 || nums[nums.length-1]==2){
     return false;
 }
 else if(nums[0]==3 || nums[nums.length-1]==3){
     return false;  
 }
       
  return true;
}
}
