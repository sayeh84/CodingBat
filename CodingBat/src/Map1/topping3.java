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
public class topping3 {
       
  public Map<String, String> topping3(Map<String, String> map) {
  
      
      if(map.containsKey("potato")){
       
          map.put("fries",map.get("potato"));
        
      
      }
    
       if(map.containsKey("salad")){
          map.put("spinach", map.get("salad")); 
      }
      return map;
}
  
     
}
