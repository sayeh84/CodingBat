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
public class noX {
     public List<String> noX(List<String> strings) {
  
  
  List<String> newNums= new   ArrayList<>();
      
  strings.stream().map((string) -> string.replace("x", "")).forEach((newValue) -> {
      newNums.add(newValue);
  });
     
     
     return newNums;
}
  
}
