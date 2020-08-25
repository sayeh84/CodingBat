/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String2;

/**
 *
 * @author someya.sayeh
 */
public class doubleChar {

    public String doubleChar(String str) {
        String newStr = "";
        for (int j = 0; j < str.length(); j++) {

            newStr += str.substring(j, j + 1) + str.substring(j, j + 1);

        }

        return newStr;

    }
}
