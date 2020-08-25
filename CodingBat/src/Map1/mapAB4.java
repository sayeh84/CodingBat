/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map1;

import java.util.Map;

/**
 *
 * @author someya.sayeh
 */
public class mapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {

            String valueA = map.get("a");
            String valueB = map.get("b");

            if (valueA.length() == valueB.length()) {
                map.put("a", "");
                map.put("b", "");
            } else {

                int max = Math.max(valueA.length(), valueB.length());
                map.put("c", valueB);

                if (valueA.length() == max) {
                    map.put("c", valueA);

                }

            }

        }

        return map;
    }
}
