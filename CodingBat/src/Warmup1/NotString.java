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
public class NotString {

    public String notString(String str) {

        String newString = "not " + str;
        if (str.startsWith("not")) {
            newString = str;
        }

        return newString;
    }

}
