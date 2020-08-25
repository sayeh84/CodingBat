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
public class StringSplosion {
    public String stringSplosion(String str) {
  String result = "";
  int y= str.length();
  
  for (int i=0; i<str.length(); i++) {
   
    result =  str.substring(0, y)+  result;
y-=1;
  }
  return result;
}
}
