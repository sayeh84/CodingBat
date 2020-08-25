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
public class left2 {
   public String left2(String str) {
 
 String n=  str.substring(0,2);
 
 return   str.replace(n, "")+n;
} 
}
