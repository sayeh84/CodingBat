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
public class StringMatch {
     
 public int stringMatch(String a,String b) {
  
  int strNumberA= (a.length()/2)*2;
  int strNumberB= (b.length()/2)*2;
 
  int j=0;
  int x=0;
  int y=2;
   int len = Math.min(a.length() , b.length() )-1;
 
  for(int i=0; i<len; i++){
 
  String newStrA=  a.substring(x, y);
  String newStrB=  b.substring(x, y);
  x+=1;
   y+=1;  
  
  
   if(newStrA.equals(newStrB) ){
         j++;
     }
  }
 
  return j  ;
}
}
