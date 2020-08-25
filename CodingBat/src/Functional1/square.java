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
public class square {
          public List<Integer> square(List<Integer> nums) {
      List<Integer> newNums= new   ArrayList<>();
      
 
              for (Integer num : nums) {
                  int newValue = num * num;
                  newNums.add(newValue);
              }
     
     
     return newNums;
}

}
