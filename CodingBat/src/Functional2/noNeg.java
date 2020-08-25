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
public class noNeg {
    
   public List<Integer> noNeg(List<Integer> nums) {
    List<Integer> newNums= new   ArrayList<>();
    
    
    nums.stream().filter((num) -> (num >= 0)).forEach((num) -> {
        newNums.add(num);
    });
    
    
    
    return newNums;
      
}   
}
