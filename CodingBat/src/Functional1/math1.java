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
public class math1 {
    public List<Integer> math1(List<Integer> nums) {
  List<Integer> newNums= new   ArrayList<>();

  nums.stream().map((num) -> (1 + num) * 10).forEach((newValue) -> {
      newNums.add(newValue);
  });
     
     
     return newNums;
}

}
