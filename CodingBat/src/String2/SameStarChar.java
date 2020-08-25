/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String2;

/**
 *
 * @author someya.sayeh
 */
public class SameStarChar {

    /**
     * @param str
     * @param args the command line arguments
     * @return 
     */
    public static boolean sameStarChar(String str) {

           for (int i = 1; i < str.length() - 1; i++) {
                     System.out.println( str.charAt(i));
                if (str.charAt(i) == '*' && i!=0 && str.length()>=3) {
             
                    if (!str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) {
                        return false;
                    }
                 
                } 
           

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("**"));
    }

}
