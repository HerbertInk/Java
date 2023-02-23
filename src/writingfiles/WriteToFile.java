/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingfiles;
import java.io.*;
/**
 *
 * @author asm
 */
 
public class  WriteToFile{
    public static void main (String []args){
       try{
        FileWriter writer = new FileWriter("myfile.txt");
        writer.write("OOP my favorite");
        writer.write("\n --------------------------------------------------------------");
        writer.write("\n Hey, I'm Gloria Kataike,");
        writer.write(" your colleague! \t ");
        writer.write("\n How can I help you?\t"); 
        writer.write("\n Wanna write some Java aah?");
        writer.write("\n (smiles)you could tap me");
        
        // using tabs leaves space
        writer.write("\n Using tab i.e \t");
        writer.write("\n -----------------------------------------");
        writer.write("\n Lyn Tukei\t 2020\tBSE\t002\tPS"); 
        writer.write("\n Charity Delmus\t 2020\t BSE\t 003 \tPS");
        writer.write("\n Eric Wamala\t 2020\t BSE \t004 \tPS");
        writer.close();
       }
       catch(IOException ex){
           ex.printStackTrace();
       }
        
       } 
    }

  
   