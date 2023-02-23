package simple_client_server_with_serializable;
//import gui_client_server_with_serialization.ObjectToClient_Serialized;
import java.awt.event.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;

////////////////////////////
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//////////// end ///////////////


public class Server extends javax.swing.JFrame {
    ObjectOutputStream serverObjectStreamWriter;
     
     ObjectInputStream serverObjectStreamReader, isReader;
     
     ServerSocket serverSock ;
     Socket clientSocket;
     serializableClass serialObj;
    /**
     * Creates new form server
     */
    public void server() {
        initComponents();
        serverObjectStreamWriter = null;
        serverObjectStreamReader = null;
        serverSock = null;
        clientSocket = null;
        serialObj = null;     
    }
    
    
    public void go() {
        try{
	    serverSock = new ServerSocket(50000);
	    //while(true){
	    serialObj= new serializableClass();
            clientSocket = serverSock.accept();
            //serverObjectStreamWriter.flush(); // clear the stream
            serverObjectStreamReader = new ObjectInputStream(clientSocket.getInputStream());
            serverObjectStreamWriter = new ObjectOutputStream(clientSocket.getOutputStream());

            Thread t = new Thread(new ServerRunnable());

            t.start();
            System.out.println("got a connection");
            //}//close while
	    }catch(Exception ex){
             ex.printStackTrace();
	    }
    }
    
    public class ServerRunnable implements Runnable{

    public void run(){
        try{
            while((serialObj = (serializableClass) serverObjectStreamReader.readObject()) != null)
            {
                txtRegNo.setText(serialObj.regno);
                txtSurName.setText(serialObj.surname);
            go();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//close run

	}//close inner class

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSurName = new javax.swing.JLabel();
        txtSurName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblRegNo = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("server");

        lblSurName.setText("SurName");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblRegNo.setText("RegNo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSurName)
                    .addComponent(lblRegNo))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtSurName))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegNo)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurName)
                    .addComponent(txtSurName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        serialObj.regno   = txtRegNo.getText();
        serialObj.surname = txtSurName.getText();
        // if the file does not exist, you can first create it here manually
        // using itext package
        
        serialObj.myfile = new File("HitTable.pdf");
        try {
            //serverObjectStreamWriter.flush(); // clear the stream
            
            serverObjectStreamWriter.writeObject(serialObj);
            //serverObjectStreamWriter.flush();//to avoid the stream from being corrupted
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    public static void main(String[] args){
        server s = new server();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.go();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblRegNo;
    private javax.swing.JLabel lblSurName;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtSurName;
    // End of variables declaration//GEN-END:variables
}
