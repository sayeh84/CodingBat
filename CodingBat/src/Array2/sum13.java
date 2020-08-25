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
public class sum13 {
  public int sum13(int[] nums) {
  
 
 int sum=0;
 
 if(nums.length >=1){
  for(int i=0; i< nums.length; i++){
 
   
  if(nums[nums.length-1]==13 ){
   nums[nums.length-1]= 0;
  
  }

   sum=sum+nums[i];
   if(nums[i]==13  &&  nums[i]!=nums[nums.length-1]){
       int unluckyNumber= nums[i]+nums[i+1];
       sum = sum-unluckyNumber; 
   
   
     
    }}
    
  
  }
  return  sum;
}
  
}
