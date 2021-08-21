package BSEJava;

/**
 @author Ink
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame {
 JButton bChange, aChange;// instance variable declaration
    
    //Constructor
    public ButtonDemo(){
      //create Object of Jbutton
      bChange  = new JButton("Ink");
      aChange  = new JButton("Save");
      //specify a layout manager ie  FlowLayout 
      getContentPane().setLayout(new FlowLayout());
      //add button to the frame
      getContentPane().add(bChange);
      getContentPane().add(aChange);
      
    }
    
    
    public static void main(String[]args){
        ButtonDemo frm = new ButtonDemo();
        WindowQuitter wquit = new WindowQuitter();
        frm.addWindowListener(wquit);
        frm.setSize(400, 200);
        frm.setVisible(true);
        
    }
}

/**class WindowQuitter extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
*/