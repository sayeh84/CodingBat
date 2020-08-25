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
public class catDog {

    public boolean catDog(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).contains("cat")) {
                x++;

            } else if (str.substring(i, i + 3).contains("dog")) {
                y++;

            }

        }

        return x == y;

    }
}
