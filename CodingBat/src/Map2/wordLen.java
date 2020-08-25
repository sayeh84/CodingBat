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
public class wordLen {
    public Map<String, Integer> wordLen(String[] strings) {
  
  Map<String, Integer> map=   new HashMap<>();
  
   for (String string : strings) {
        
        if(!map.containsKey(string)){
             map.put(string, string.length());  
        }
      
    }
      
  
    return map;
}  
}
