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
public class BackAround {

    public String backAround(String str) {

        String newString = str;

        return str.charAt(str.length() - 1) + newString + str.charAt(str.length() - 1);
    }

}
