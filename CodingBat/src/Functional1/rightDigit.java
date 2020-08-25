/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functional1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author someya.sayeh
 */
public class rightDigit {

    public List<Integer> rightDigit(List<Integer> nums) {

        List<Integer> newNums = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            String stringValue = "" + nums.get(i);

            String value = stringValue.substring(stringValue.length() - 1, stringValue.length());

            int newValue = Integer.parseInt(value);

            newNums.add(newValue);

        }

        return newNums;

    }
}
