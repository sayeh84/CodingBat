/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1;

/**
 *
 * @author someya.sayeh
 */
public class extraEnd {
    public String extraEnd(String str) {
  
  
  String newStr="";
  
  
  for(int i =0; i<3 ; i++){
     newStr+= str.substring(str.length()-2);
  }
  
  
  return newStr;
}
}
