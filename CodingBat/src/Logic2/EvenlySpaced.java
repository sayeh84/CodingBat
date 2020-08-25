/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic2;

/**
 *
 * @author someya.sayeh
 */
public class EvenlySpaced {

    /**
     * @param a
     * @param args the command line arguments
     * @param c
     */
    public static boolean evenlySpaced(int a, int b, int c) {

        int diff1 = Math.abs(a - b);

        int diff2 = Math.abs(a - c);

        int diff3 = Math.abs(b - c);

        if (diff1 == diff2) {
            return true;
        }

        if (diff1 == diff3) {
            return true;
        }

        if (diff2 == diff3) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(evenlySpaced(4, 6, 3));
    }

}
