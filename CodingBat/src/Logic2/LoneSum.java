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
public class LoneSum {

    /**
     * @param args the command line arguments
     */
    public static int loneSum(int a, int b, int c) {
        
        if (a == b && a != c && b != c) {
            return c;
        } else if (a == c && a != b && b != c) {
            return b;
        } else if ( b == c && a != c && b != a) {
            return a;
        } else if (a == b && a == c && b == c) {
            return 0;
        }

        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(loneSum(6, 6, 6));
    }

}
