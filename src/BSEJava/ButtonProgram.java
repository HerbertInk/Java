package BSEJava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonProgram extends JFrame{
    JButton aChange, bChange, cChange, dChange, eChange, fChange; //Instance variable declaration
    JPanel btnPanel;
    JLabel lblRegno;
    JTextField txtRegno;
    // constructor
    public ButtonProgram(){
        setTitle("Ink's");
        //create object of JButton
        aChange = new JButton("Ink");
        bChange = new JButton("Abby");
        cChange = new JButton("Blockchain");
        dChange = new JButton("Cryptography");
        eChange = new JButton("Bitcoin");
        fChange = new JButton("The Ink's");
        btnPanel = new JPanel(); // creating a panel object( Container object )
        // add buttons to a panel

        btnPanel.add(aChange);
        btnPanel.add(bChange);
        btnPanel.add(cChange);
        btnPanel.add(dChange);
        btnPanel.add(eChange);


        // specify a layout manager ie FlowLayOut
        //getContentPane().setLayout(new FlowLayout());
        getContentPane().add(BorderLayout.NORTH, fChange);
        //getContentPane().add(BorderLayout.EAST, bChange);
        getContentPane().add(BorderLayout.SOUTH, btnPanel);

        //getContentPane().add(BorderLayout.WEST, dChange);
        // add button to the frame
        //getContentPane().add(BorderLayout.SOUTH, eChange);
        //getContentPane().add(aChange);

    }


    public static void main(String[]args){
        ButtonProgram frm = new ButtonProgram();
        WindowQuitter wquit = new WindowQuitter();
        frm.addWindowListener(wquit);
        frm.setSize(400,400);
        frm.setVisible(true);
    }


}
class WindowQuitter extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}