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
public class hasBad {

    public boolean hasBad(String str) {

        if (str.startsWith("bad", 0)) {
            return true;
        } else if (str.startsWith("bad", 1)) {
            return true;
        }

        return false;
    }
}
