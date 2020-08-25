/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic1;

/**
 *
 * @author someya.sayeh
 */
public class Love6 {

    /**
     * @param a
     * @param b
     * @return
     */
    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || (a + b) == 6 || (b - a) == 6 || (b - a) == -6;
    }

    public static void main(String[] args) {
        System.out.println(love6(1, 2));
    }

}
