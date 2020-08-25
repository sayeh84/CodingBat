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
public class swapEnds {
  public int[] swapEnds(int[] nums) {
 int []  num= new int[nums.length];
 int temp;
  num[0]=nums[nums.length-1];
for (int i = 1; i <nums.length-1; i++)
  {
      temp= nums[i];
     
      num[i]=temp;
  }
 
  num[num.length-1]=nums[0];
  
  return num;

}  
}
