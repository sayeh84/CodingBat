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
public class topping2 {

    public Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")) {

            map.put("yogurt", map.get("ice cream"));
            if (map.containsKey("spinach")) {

                map.put("spinach", "nuts");

            }

        }

        return map;
    }
}
