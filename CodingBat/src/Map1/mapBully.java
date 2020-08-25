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
public class mapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
if (map.containsKey("a")) {
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  return map;
}

}
