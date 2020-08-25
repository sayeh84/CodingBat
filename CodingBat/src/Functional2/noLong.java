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
public class noLong {
    public List<String> noLong(List<String> strings) {
   List<String> newNums= new   ArrayList<>();
      
 
   strings.stream().filter((newValue) -> (newValue.length() <=3)).forEach((newValue) -> {
       newNums.add(newValue);
   });
     
     
     return newNums;
}
}
