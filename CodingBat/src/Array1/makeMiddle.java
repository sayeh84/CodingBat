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
public class makeMiddle {
    public int[] makeMiddle(int[] nums) {  
   int number  = nums.length/2;   
    int[] newMuns=  new int  [] {nums[number-1], nums[number]};
 
   return newMuns;
}
}
