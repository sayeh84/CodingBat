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
public class endsLy {

    public boolean endsLy(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() - 2).equals("ly");
        }

        return false;
    }
}
