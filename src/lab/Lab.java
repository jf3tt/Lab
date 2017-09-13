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
            
            System.out.println("___________$$\n"
                    + "____________$$$$$$\n"
                    + "___________$$$$$$$$\n"
                    + "___$$$$$$$__$$$$$$__$$$$$$\n"
                    + "__$$$$$$$$$_ $$$$$_ $$$$$$$$\n"
                    + "___$$$$$$$$$_$$$$$_$$$$$$$$\n"
                    + "____$$$$$$$$_ $$$$_$$$$$$$\n"
                    + "________$$$$$_$$$_$$$$$\n"
                    + "_$$$$$$$$$_ $____$_$$$$$$$$$\n"
                    + "$$$$$$$$$$ $______$ $$$$$$$$$$\n"
                    + "$$$$$$$$$$$______ $$$$$$$$$$$\n"
                    + "_$$$$$$$$$_$_____$_$$$$$$$$$\n"
                    + "_________$$$$$_$$$_$$$$$\n"
                    + "_____$$$$$$$$_ $$$$_$$$$$$$\n"
                    + "____$$$$$$$$$_$$$$$_$$$$$$$$\n"
                    + "___$$$$$$$$$_ $$$$$_ $$$$$$$$\n"
                    + "____$$$$$$$__$$$$$$__$$$$$$\n"
                    + "____________$$$$$$$$_$$\n"
                    + "_____________$$$$$$_ $$\n"
                    + "______$$$$$_________$$\n"
                    + "_____$$$$$$$_______ $$\n" 
                    + "___$$$$$$$$$$$_____$$\n"
                    + "_____ $$$$$$$$$___ $$\n"
                    + "________$$$$$$$__$$\n"
                    + "__________$$$$$_$$\n" 
                    + "___________$$$$$$\n"
                    + "____________$$$$\n"
                    + "_____________$$\n"
                    + "____________$$____$$$$$$$\n"
                    + "___________ $$___$$$$$$$$$$\n"
                    + "___________$$__$$$$$$$$\n"
                    + "___________$$_$$$$$$\n"
                    + "___________$$_$$$$$\n"
                    + "___________$$$$$$\n"
                    + "___________$$$$");
            
            System.out.println("Congratulations to my favorite programmer <3");
        } 
        else {
            System.out.println("Not today");
        }
    }
}
