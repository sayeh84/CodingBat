/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup1;

/**
 *
 * @author someya.sayeh
 */
public class StartOz {

    /**
     * @param str
     * @return
     */
    public static String startOz(String str) {
        String newString = "";

        if (str.length() >= 1 && str.substring(0, 1).equals("o")) {
            newString = "o";
        }
        if (str.length() >= 2 && str.substring(1, 2).equals("z")) {
            newString += "z";
        }

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
    }

}
