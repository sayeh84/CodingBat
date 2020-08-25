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
public class MixStart {

    /**
     * @param args the command line arguments
     */
    public static boolean mixStart(String str) {
        return str.length()>= 3&&   str.substring(1,3).equals("ix");
    }

    public static void main(String[] args) {
        System.out.println(mixStart("abcd"));
    }

}
