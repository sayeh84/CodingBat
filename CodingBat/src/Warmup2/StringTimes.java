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
public class StringTimes {

    public String stringTimes(String str, int n) {
        String newStr = "";

        for (int i = 0; i < n; i++) {
            newStr += str;
        }

        return newStr;

    }

}
