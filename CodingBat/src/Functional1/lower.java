/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functional1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author someya.sayeh
 */
public class lower {
   public List<String> lower(List<String> strings) {
  
  
  List<String> newNums= new   ArrayList<>();
      
  strings.stream().map((string) -> string.toLowerCase()).forEach((newValue) -> {
      newNums.add(newValue);
  });
     
     
     return newNums;
}
 
}
