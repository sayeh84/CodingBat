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
public class EndUp {

    public String endUp(String str) {

        String newStr = "";

        if (str.length() > 3) {
            newStr = str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
        } else {
            newStr = str.toUpperCase();
        }

        return newStr;
    }
}
