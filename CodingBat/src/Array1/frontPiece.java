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
public class frontPiece {

    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            int[] newNums = new int[2];

            newNums[0] = nums[0];

            newNums[1] = nums[1];

            nums = newNums;

        }

        return nums;
    }
}
