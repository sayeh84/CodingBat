/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1;

import static String1.MakeOutWord.makeOutWord;

/**
 *
 * @author someya.sayeh
 */
public class FirstHalf {
    public  static String firstHalf(String str) {
  int halfNumber =str.length()/2;
  return str.substring(0, halfNumber);
  
  
}
    
 
    public static void main(String[] args) {
        System.out.println(firstHalf("SaraDara"));
    }

}
