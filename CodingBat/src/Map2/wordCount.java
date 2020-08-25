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
public class wordCount {
      public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map=   new HashMap<>();
     
          for (String string : strings) {
              int y=0;
              String value="";
        for (String string1 : strings) {
            if (string.equals(string1)) {
                y++;
                value = string;
            }
        }
              map.put(value,y);
          }    
     
 return map;
} 
}
