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
public class EveryNth {

    public String everyNth(String str, int n) {
        String newC = "";
        for (int i = 0; i < str.length(); i += n) {
            char c = str.charAt(i);
            newC += c;
        }
        return newC;

    }
}
