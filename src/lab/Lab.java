/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Calendar;

/**
 *
 * @author jangofett
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dayX = calendar.get(Calendar.DAY_OF_YEAR);
        
        if (dayX == 256) {
            System.out.println("My congratulations to my favorite programmer");
        } 
        else {
            System.out.println("Not today");
        }
    }
}
