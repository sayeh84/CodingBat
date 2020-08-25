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
public class topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        
         map.put("bread", "butter");
          if (map.containsKey("ice cream")) {
                     map.put("ice cream", "cherry");
          }   
         
  return map;
}
}
