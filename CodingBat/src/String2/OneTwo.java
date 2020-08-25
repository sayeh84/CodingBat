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
public class OneTwo {

    /**
     * @param args the command line arguments
     */
    public static String oneTwo(String str) {
  String result = "";
        if (str.length() % 3 == 0) {
           for(int i=0; i <str.length(); i += 3){
              
                result = result + str.substring(i+1,i+3) + str.charAt(i);
        
               

            }

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(oneTwo("tcadogjio"));
    }

}
