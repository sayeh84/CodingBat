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
public class theEnd {

    public String theEnd(String str, boolean front) {
        String newStr = "";

        if (!str.isEmpty()) {
            if (front == true) {
                newStr = str.substring(0, 1);
            } else if (front == false) {
                newStr = str.substring(str.length() - 1);
            }
        }

        return newStr;
    }
}
