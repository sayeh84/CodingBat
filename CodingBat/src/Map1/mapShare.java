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
public class mapShare {

    public Map<String, String> mapShare(Map<String, String> maps) {

        if (maps.containsKey("a")) {

            String values = maps.get("a");
            if (maps.containsKey("b")) {

                maps.put("b", values);
            } else if (!maps.containsKey("b")) {

                maps.put("b", values);
            }

        }
        if (maps.containsKey("c")) {

            maps.remove("c");
        }
        return maps;

    }
}
