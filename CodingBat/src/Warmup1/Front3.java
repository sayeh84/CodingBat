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
public class Front3 {

    public String front3(String str) {

        if (str.length() > 3) {

            String newstr = str.substring(0, 3);
            str = newstr;

        }

        return str += str + str;
    }
}
