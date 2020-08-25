/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup1;

/**
 *
 * @author someya.sayeh
 */
public class StringE {

    public boolean stringE(String str) {

        char[] c_arr = str.toCharArray();

        int nummerOfE = 0;

        for (int i = 0; i < c_arr.length; i++) {
            if (c_arr[i] == 'e') {
                nummerOfE++;
            }
        }
        return nummerOfE >= 1 && nummerOfE <= 3;
    }

}
