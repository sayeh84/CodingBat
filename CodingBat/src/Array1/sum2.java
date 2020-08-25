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
public class sum2 {

    public int sum2(int[] nums) {
        int sum = 0;
        if (nums.length >= 2) {

            sum = nums[0] + nums[1];

        } else if (nums.length < 2 && nums.length > 0) {
            sum = nums[0];
        }

        return sum;

    }
}
