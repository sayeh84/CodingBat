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
public class Old35 {

    /**
     * @param n
     * @return
     */
    public static boolean old35(int n) {
        return (n % 3 == 0 && n % 5 != 0) || (n % 5 == 0 && n % 3 != 0);
    }

    public static void main(String[] args) {
        System.out.println(old35(3));
    }

}
