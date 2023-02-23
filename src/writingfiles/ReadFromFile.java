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
public class ReadFromFile {
    public static void main(String[]args) throws IOException{
        //while loop allows the user to re_enter the correct file name with out the program exiting 
        while(true){ 
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(inStream);
        String myFile;
        System.out.println("Enter file name: ");
        myFile = inData.readLine();
        
        try{
            File filetoread = new File(myFile);
            FileReader filereader = new FileReader(filetoread);
            BufferedReader reader = new BufferedReader(filereader);
            String line = null;
            while ((line = reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();
            break;//after outputting the contents of the file
        }
            catch (FileNotFoundException ex){
                System.out.println("OPPS! I'm sorry, you entered a wrong file name");
                System.out.println("But,you  could enter a correct one and try again ");
                System.out.println("Good luck!");
                //return;//terminates main method
            }
            catch(IOException ex){
           ex.printStackTrace();
       }
        
    }
    
}
}
