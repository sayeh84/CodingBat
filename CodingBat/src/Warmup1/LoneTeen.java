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
public class LoneTeen {

    public boolean loneTeen(int a, int b) {

        boolean ab = (a >= 13 && a <= 19);

        boolean bb = (b >= 13 && b <= 19);

        return (ab && !bb) || (!ab && bb);
    }
}
