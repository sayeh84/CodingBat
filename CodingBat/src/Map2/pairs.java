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
public class pairs {
     
  public Map<String, String> pairs(String[] strings) {
  Map<String, String> map=   new HashMap<>();
  
   for (String string : strings) {
      map.put(string.substring(0,1), string.substring(string.length()-1,string.length()));  
        
     if(!map.containsKey(string.substring(0))){
          
    }  
   }
     
  
  
 return map;
}
}
