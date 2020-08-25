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
public class countHi {

    public int countHi(String str) {

        int i = 0;

        for (int j = 0; j < str.length() - 1; j++) {

            if (str.substring(j, j + 2).equals("hi")) {
                i++;
            }

        }

        return i;

    }
}
