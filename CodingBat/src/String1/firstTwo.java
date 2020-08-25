/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1;

/**
 *
 * @author someya.sayeh
 */
public class firstTwo {

    public String firstTwo(String str) {

        String newStr = str;

        if (str.length() > 2) {

            newStr = str.substring(0, 2);

        }

        return newStr;
    }

}
