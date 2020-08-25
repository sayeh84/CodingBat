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
public class noZ {
    public List<String> noZ(List<String> strings) {
   List<String> newNums= new   ArrayList<>();
      
   
   strings.stream().filter((string) -> (!string.contains("z"))).forEach((string) -> {
       newNums.add(string);
   });
   return newNums;
}
  
}
