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
public class countCode {

    public int countCode(String str) {
        int j = 0;

        for (int i = 0; i < str.length() - 3; i++) {

            if (str.length() >= 4) {
                if (str.substring(i, i + 1).equals("c") && str.substring(i + 1, i + 2).equals("o") && str.substring(i + 3, i + 4).equals("e")) {
                    j++;

                }

            }
        }

        return j;
    }
}
