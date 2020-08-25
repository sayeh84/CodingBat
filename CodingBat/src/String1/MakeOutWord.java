/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1;

/**
 *
 * @author someya.sayeh
 */
public class MakeOutWord {

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, out.length());
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
    }

}
