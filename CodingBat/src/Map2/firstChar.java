/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author someya.sayeh
 */
public class firstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        List<String> newNums = new ArrayList<>();

        String charValue = "";
        String value = "";

        for (int j = 0; j < strings.length; j++) {

            charValue = strings[j].substring(0, 1);
            value = strings[j];
            map.put(strings[j].substring(0, 1), value);
            for (int i = 0; i < strings.length; i++) {

                if (charValue.equals(strings[i].substring(0, 1))) {

                    if (i != j) {

                        value = strings[i] + value;

                        map.put(strings[j].substring(0, 1), value);

                    }

                }
            }

        }

        return map;
    }
}
