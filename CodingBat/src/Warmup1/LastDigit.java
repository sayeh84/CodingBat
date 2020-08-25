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
public class LastDigit {

    public boolean lastDigit(int a, int b) {

        char[] charA = Integer.toString(a).toCharArray();
        char[] charB = Integer.toString(b).toCharArray();

        return charA[charA.length - 1] == charB[charB.length - 1];
    }

}
