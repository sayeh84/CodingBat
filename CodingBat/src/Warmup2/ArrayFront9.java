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
public class ArrayFront9 {

    public boolean arrayFront9(int[] nums) {

        int j = 3;

        if (nums.length < 4) {
            j = nums.length;
        }

        for (int i = 0; i < j; i++) {

            if (nums[i] == 9) {
                return true;

            }
        }

        return false;
    }

}
