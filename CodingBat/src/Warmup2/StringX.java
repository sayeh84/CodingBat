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
public class StringX {

    public String stringX(String str) {

        String newString = str;

        if (str.length() >= 2) {

            String s = "";
            String e = "";
            if (str.substring(0, 1).equals("x")) {
                s = "x";
            }

            if (str.substring(str.length() - 1).equals("x")) {
                e = "x";
            }
            newString = s + str.replace("x", "") + e;

        }

        return newString;

    }
}
