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
public class bobThere {

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).contains("b") && str.substring(i + 2, i + 3).contains("b")) {

                return true;

            }
        }

        return false;

    }
}
