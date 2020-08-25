/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array1;

/**
 *
 * @author someya.sayeh
 */
public class front11 {

    public int[] front11(int[] a, int[] b) {

        if (a.length >= 1 && b.length >= 1) {
            int[] num = new int[2];

            num[0] = a[0];
            num[1] = b[0];
            a = num;

        } else if (a.length >= 1 && b.length < 1) {
            int[] num = new int[1];

            num[0] = a[0];

            a = num;

        } else if (a.length < 1 && b.length >= 1) {
            int[] num = new int[1];

            num[0] = b[0];

            a = num;

        }

        return a;

    }

}
