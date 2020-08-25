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
public class More20 {

    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public static void main(String[] args) {
        System.out.println(more20(21));
    }

}
