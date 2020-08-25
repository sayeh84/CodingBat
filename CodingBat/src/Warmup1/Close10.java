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
public class Close10 {

    /**
     * @param a
     * @param b
     * @return 
     */
    public static int close10(int a, int b) {
        int diffA = 10 - a;
        int newDiffA = Math.abs(diffA);
        int diffB = 10 - b;
        int newDiffB = Math.abs(diffB);

        if (newDiffB == newDiffA) {
            return 0;
        }
        if (newDiffB < newDiffA) {
            return b;
        } else {
            return a;
        }

    }

    public static void main(String[] args) {
            System.out.println(close10(4,9));
    }

}
