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
public class noYY {
  public List<String> noYY(List<String> strings) {
   List<String> newNums= new   ArrayList<>();   
   strings.stream().map((string) -> string + "y").filter((value) -> (!value.contains("yy"))).forEach((value) -> {
       newNums.add(value);
   });
   return newNums; 
}  
}
