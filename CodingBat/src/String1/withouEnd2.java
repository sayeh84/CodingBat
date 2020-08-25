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
public class withouEnd2 {
    public String withouEnd2(String str) {
  String m="";
 if(str.length()>2){
   
m=  str.substring(1,(str.length()-1));
  
 }
   
  return m;
}
}
