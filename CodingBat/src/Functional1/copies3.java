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
public class copies3 {
       public List<String> copies3(List<String> strings) {
    List<String> newNums= new   ArrayList<>();
      
 
           for (String string : strings) {
               String newValue="";
               for (int j = 0; j<3; j++) {
                   newValue += string;
               }
               newNums.add(newValue);
           }
     
     
     return newNums;
}
}
