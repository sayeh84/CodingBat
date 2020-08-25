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
public class comboString {

    public String comboString(String a, String b) {

        String str = "";
        if (a.length() > b.length()) {
            str = b + a + b;
        }

        if (a.length() < b.length()) {
            str = a + b + a;
        }

        return str;
    }

}
