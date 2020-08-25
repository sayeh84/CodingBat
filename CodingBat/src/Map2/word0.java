/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author someya.sayeh
 */
public class word0 {
      public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map=   new HashMap<>();
    for (String string : strings) {
        
        if(!map.containsKey(string)){
             map.put(string, 0);  
        }
      
    }
      
      return map;
}
}
