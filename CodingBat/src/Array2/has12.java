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
public class has12 {

    public boolean has12(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            j++;

            for (int x = 0; x < nums.length - j; x++) {
                if (nums[x] == 1 && nums[x + j] == 2) {
                    return true;
                }

            }
        }

        return false;
    }

}
