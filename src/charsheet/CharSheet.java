/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charsheet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author jay
 */
public class CharSheet {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException, IOException{
        int str, dex, con, wis, intel, cha;
        String askstr, askdex, askcon, askwis, askintel, askcha;
        askstr = "enter strentgh score";
  
        
        

		// get required input using dialogs
                
                
		askstr   = "Please enter strength: ";
		str = Integer.parseInt(getNumericInput(askstr));
                
                askdex = "Please enter dexterity";
                dex = Integer.parseInt(getNumericInput(askdex));
                askcon = "please enter Constitution";
                con = Integer.parseInt(getNumericInput(askcon));
                
    }
    
     private static String getstringInput(String prompt)
    {
        int count = 0;
        String input;
        input = JOptionPane.showInputDialog( prompt );
        while ((input != null && input.length() == 0) && (count <2))
        {
            input = JOptionPane.showInputDialog("There was no input detected. \n" + prompt);
            count++;
        }
        
        if (count==2)
        {
            JOptionPane.showMessageDialog(null, " You did'nt make an entry please try again later when you are ready to order.  Ending Order.");
            System.exit(0);
        }
        return input;
    }
        
     private static String getNumericInput(String numPrompt) throws IOException
         {
   		  int numb = 0;
   		  int count = 0;
   	        String input;
   	        input = JOptionPane.showInputDialog( numPrompt );
   	        numb = Integer.parseInt(input);
   	        	      
   	        
   	        if ( count <2 && (numb >99 || numb < 1))
   	        {
   	            input = JOptionPane.showInputDialog("Invalid input was detected. \n" + numPrompt);
   	            count++;
   	        }
   	        
   	        else if (count==2)
   	        {
   	            JOptionPane.showMessageDialog(null, " You did not make an entry please try again later when you are ready to order.  ORDER TERMINATING.");
   	            System.exit(0);
   	        }
   			return input;
         }
    
}
