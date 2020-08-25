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
public class DoubleX {

    boolean doubleX(String str) {

        char[] c_arr = str.toCharArray();

        for (int j = 0; j < c_arr.length - 1; j++) {

            if (c_arr[j] == 'x' && c_arr[j + 1] == 'x') {

                return true;

            } else if (c_arr[j] == 'x' && c_arr[j + 1] != 'x') {

                return false;

            }
        }

        return false;
    }
}
