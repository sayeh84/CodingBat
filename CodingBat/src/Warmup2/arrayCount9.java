/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup2;

/**
 *
 * @author someya.sayeh
 */
public class arrayCount9 {

    public int arrayCount9(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 9) {
                j++;
            }
        }
        return j;

    }

}
