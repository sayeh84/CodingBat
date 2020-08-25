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
public class mapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
  
  if (map.containsKey("a")) {
                 if (map.containsKey("b")) {
                       String valuesOfA =map.get("a");
                         String valuesOfB =map.get("b");
                         
                         if(valuesOfA.equals(valuesOfB)){
                           map.remove("a");
                           map.remove("b");
                         }
                         
                
            }
            }
      
      
  return map;
}
  
}
