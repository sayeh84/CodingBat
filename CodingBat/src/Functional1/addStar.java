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
public class addStar {
    public List<String> addStar(List<String> strings) {
   List<String> newNums= new   ArrayList<>();
     
   strings.stream().map((string) -> string + "*").forEach((newValue) -> {
       newNums.add(newValue);
   });
     
     
     return newNums;
}

}
