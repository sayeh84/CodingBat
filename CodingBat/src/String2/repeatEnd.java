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
public class repeatEnd {

    public String repeatEnd(String str, int n) {
        String newStr = "";
        String res = "";
        if (n == 0 || n <= str.length()) {
            newStr = (str.substring(str.length() - n, str.length()));

            for (int i = 0; i < n; i++) {
                res = res + newStr;
            }
        }

        return res;

    }

}
