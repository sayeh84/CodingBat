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
public class FrontTime {

    public String frontTimes(String str, int n) {

        String newStr = "";

        for (int i = 0; i < n; i++) {

            if (str.length() >= 3) {
                newStr += str.substring(0, 3);;
            } else {
                newStr += str;
            }

        }

        return newStr;

    }

}
