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
public class MiddleThree {

    public static String middleThree(String str) {
        if ((str.length()) % 2 != 0) {
            if (str.length() >= 3) {
                int middleNumber = (str.length() - 3) / 2;
                str = str.substring(middleNumber, (str.length() - middleNumber));
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println( middleThree("SaraDra"));
    }

}
