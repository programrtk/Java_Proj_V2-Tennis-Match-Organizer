/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Sumit
 */
public class TennisApp extends javax.swing.JFrame {

    
    private ArrayList<Player> players;
    
    static boolean isViewed = false;
    
    private int numOfMales;
    private int numOfFemales;
    
    //private ArrayList<String> players_Data;
    
    private void writeToFile()
    {
        //this creates a file and writes a list of each player's information to it
        try{
            //createFile
            PrintWriter write = new PrintWriter("GUI_PlayerList.txt");
            System.out.println("\ntest for write in and read from files\n");
            for(int i = 0; i < players.size(); i++)
            {
                System.out.println("Write to File: "+players.get(i));
                //write.println();
                write.println(players.get(i));
            }
            
            //closefile
            write.close();
            
        }catch(IOException e){
            System.out.println("IO Exception");
        }
    }

    //this reads the contents of the file created
    private void readFromFile()
    {
        try{
            
            File file = new File("GUI_PlayerList.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));
            
            String aPlayer;
            while((aPlayer = read.readLine()) != null)
            {
                //System.out.println(aPlayer);
                stringToAddPlayer(aPlayer);
            }
            read.close();
            
            }catch(IOException e){
            System.out.println("File is not found");
            } 
                 
    }
    
    private void stringToAddPlayer(String playerData)
    {
        String[] dataPieces = new String[3];
        String delimiter = " ";
        
        System.out.println("Playerdata = "+playerData);
        
        dataPieces = playerData.split(delimiter);
        
        char gender = dataPieces[2].charAt(0);
        
        System.out.println("dataPieces: "+dataPieces[0]+" "+dataPieces[1]+" "+ gender);
        
        players.add(new Player(dataPieces[0], dataPieces[1], gender));
        
        
    }

    /**
     * Creates new form TennisApp
     */
    public TennisApp() {
        initComponents();
        players = new ArrayList<Player>();
        //players_Data = new ArrayList<String>();
        numOfMales = 0;
        numOfFemales = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firstNameLbl = new javax.swing.JLabel();
        lastNameLbl = new javax.swing.JLabel();
        genderLbl = new javax.swing.JLabel();
        descriptionLbl = new javax.swing.JLabel();
        enterPlayerBtn = new javax.swing.JButton();
        firstNameFld = new javax.swing.JTextField();
        lastnameFld = new javax.swing.JTextField();
        genderFld = new javax.swing.JTextField();
        viewPlayersBtn = new javax.swing.JButton();
        TitleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstNameLbl.setText("Enter Player's First Name:");

        lastNameLbl.setText("Enter Player's Last Name:");

        genderLbl.setText("Enter Player's Gender (m/f):");

        descriptionLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 13)); // NOI18N
        descriptionLbl.setText("Created By Sumit Gupta; Enter players on team and view them");

        enterPlayerBtn.setText("Enter Player");
        enterPlayerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPlayerBtnActionPerformed(evt);
            }
        });

        firstNameFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFldActionPerformed(evt);
            }
        });

        viewPlayersBtn.setText("View Player List");
        viewPlayersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPlayersBtnActionPerformed(evt);
            }
        });

        TitleLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLbl.setText("Tennis Match Organizer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionLbl)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(genderLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(genderFld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lastNameLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lastnameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(firstNameLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(firstNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(viewPlayersBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(enterPlayerBtn)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TitleLbl)
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLbl)
                .addGap(30, 30, 30)
                .addComponent(descriptionLbl)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstNameLbl)
                    .addComponent(firstNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLbl)
                    .addComponent(genderFld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterPlayerBtn)
                .addGap(18, 18, 18)
                .addComponent(viewPlayersBtn)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFldActionPerformed
    
    private void enterPlayerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPlayerBtnActionPerformed
        // TODO add your handling code here:        
        String firstName = firstNameFld.getText();
        String lastName = lastnameFld.getText();
        String gender = genderFld.getText();
        if(firstName.length() > 0 && lastName.length() > 0 && gender.length() > 0){
            players.add(new Player(firstName, lastName, gender.charAt(0)));
            //players_Data.add(firstName +" "+ lastName+" "+ gender.charAt(0));
            //writeToFile();
        }else{
            System.out.println("Fill all the boxes");
        }
    }//GEN-LAST:event_enterPlayerBtnActionPerformed
    
    private void viewPlayersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPlayersBtnActionPerformed
        // TODO add your handling code here:
        writeToFile();
        if(!isViewed){
            new PlayerListFrame().setVisible(true);
            isViewed = true;
        }
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).isMale()){
                numOfMales++;
                System.out.println("Male added");
            }else if(players.get(i).isFemale()){
                numOfFemales++;
                System.out.println("Female added");
            }
        }
    }//GEN-LAST:event_viewPlayersBtnActionPerformed

    public int getNumOfMales()
    {
        System.out.println(numOfMales);
        return numOfMales;
    }
    
    public int getNumOfFemales()
    {
        System.out.println(numOfFemales);
        return numOfFemales;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TennisApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TennisApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TennisApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TennisApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TennisApp tennisApp = new TennisApp();
                tennisApp.setVisible(true);
                tennisApp.readFromFile();
                
                
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JButton enterPlayerBtn;
    private javax.swing.JTextField firstNameFld;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField genderFld;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastnameFld;
    private javax.swing.JButton viewPlayersBtn;
    // End of variables declaration//GEN-END:variables
}
