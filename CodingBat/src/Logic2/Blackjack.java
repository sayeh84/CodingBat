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
public class Blackjack {

    /**
     * @param a
     * @param b
     * @param args the command line arguments
     * @return
     */
    public static int blackjack(int a, int b) {
        if (a < 21 || b < 21) {
            if ((a < 21) && (b < 21)) {
                if (a > b) {
                    return a;
                } else {
                    return b;
                }

            }
            if ((b < 21) && a > 21) {
                return b;
            }
            if ((a < 21) && b > 21) {
                return a;
            }
        }

        if (a == 21 || b == 21) {
            return 21;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(blackjack(6, 6));
    }

}
