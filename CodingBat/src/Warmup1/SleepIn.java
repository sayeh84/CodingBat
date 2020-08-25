/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup1;

/**
 *
 * @author someya.sayeh
 */
public class SleepIn {

    /**
     * @param args the command line arguments
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        }

        return false;

    }

   

}
