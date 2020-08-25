/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup2;

/**
 *
 * @author someya.sayeh
 */
public class StringBits {
    
public String stringBits(String str) {
  String newWord="";
   char[] c_arr = str.toCharArray();
  
  for (int j=0; j< str.length(); j++){
     if((j % 2 == 0)) {
         newWord+= c_arr[j];
     }
  }
  
  
  
  
  return newWord;
  
  
  
  
}

}
