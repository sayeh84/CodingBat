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
public class wordMultiple {
    
  public Map<String, Boolean> wordMultiple(String[] strings) {
  
   Map<String, Boolean> map=   new HashMap<>();
 
  for (int i=0; i<strings.length; i++){
        int y=0;
  String key="";
       for (int j=0; j<strings.length; j++){
           
      if(strings[i].equals(strings[j])){
          y++;
          key=strings[i];
      }
  }
    if(y>1){
          map.put(key,true);
  }
  else  if(y==1){
      map.put(key,false);
  }
  }
  
 
  
  return map;
}  
}
