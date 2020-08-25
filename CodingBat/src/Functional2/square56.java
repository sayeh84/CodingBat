/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functional2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author someya.sayeh
 */
public class square56 {
   public List<Integer> square56(List<Integer> nums) {     
  List<Integer> newNums = new ArrayList<> ();
       for (Integer num : nums) {
           String stringValue = "" + ((num * num) + 10);
           String value= stringValue.substring(stringValue.length()-1, stringValue.length());
           if(!(value.equals("6") || value.equals("5"))){
               int newValue = Integer.parseInt(stringValue);             
               newNums.add(newValue);
               
           }
       }
        
    return  newNums;
  
} 
}
