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
public class nonStart {

    public String nonStart(String a, String b) {
        String newStr = "";

        if (a.length() > 1 || b.length() > 1) {

            newStr = a.substring(1, a.length()) + b.substring(1, b.length());
        }
        return newStr;

    }
}
