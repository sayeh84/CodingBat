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
public class middleTwo {

    public String middleTwo(String str) {

        int number = str.length() / 2;

        return str.substring(number - 1, number + 1);

    }
}
