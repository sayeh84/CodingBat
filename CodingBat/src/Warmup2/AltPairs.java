/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup2;

/**
 *
 * @author someya.sayeh
 */
public class AltPairs {

    public String altPairs(String str) {
        String m = "";
        int j = 1;
        String newString = "";
        if (str.length() > 1) {
            int number = str.length();
            for (int i = 0; i < number; i += 4) {
                char c = str.charAt(i);
                char d = str.charAt(j);
                j += 4;

                String y = c + "" + d + "";
                m += y;
                newString = m;
                if (str.length() > 4) {
                    if (str.length() % 2 == 1) {

                        number = number - 1;
                        newString = m + str.substring(str.length() - 1, str.length());
                    }
                }

            }

        } else {
            newString = str;
        }

        return newString;
    }
}
