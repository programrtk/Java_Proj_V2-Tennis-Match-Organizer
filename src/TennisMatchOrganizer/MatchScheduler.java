/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author guptas5279
 */
public class MatchScheduler extends javax.swing.JFrame {
    
    private ArrayList<Player> players;
    
    static boolean isViewed = false;
    
    //Sumit added this
    private void readFromFile()
    {
        try{
            
            File file = new File("GUI_PlayerList.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));
            
            String aPlayer;
            while((aPlayer = read.readLine()) != null)
            {
                System.out.println(aPlayer);
                stringToAddPlayer(aPlayer);
            }
            read.close();
            
            }catch(IOException e){
            System.out.println("File is not found");
            } 
                 
    }
    
    //Sumit added this
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
    
    //Sumit added this
    public String getPlayerFirstName(int i)
    {
        return players.get(i-1).getLastName();
    }
    
    /**
     * Creates new form MatchScheduler
     */
    
    //Sumit worked on this
    public MatchScheduler() {
        initComponents();
        players = new ArrayList<Player>();
    }
    
    
    /*public MatchScheduler(TennisApp te) {
        initComponents();
        tennisApp = te;
    }*/

    
    //Sumit created this GUI and worked on this method
    public void comboBoxUpdate(){
        Winner_CombBox1.removeAllItems();
        Winner_CombBox1.addItem("Choose Winner");
        Winner_CombBox1.addItem(Player1_Lbl.getText());
        Winner_CombBox1.addItem(Player2_Lbl.getText());
        
        Winner_CombBox2.removeAllItems();
        Winner_CombBox2.addItem("Choose Winner");
        Winner_CombBox2.addItem(Player3_Lbl.getText());
        Winner_CombBox2.addItem(Player4_Lbl.getText());
        
        Winner_CombBox3.removeAllItems();
        Winner_CombBox3.addItem("Choose Winner");
        Winner_CombBox3.addItem(Player5_Lbl.getText());
        Winner_CombBox3.addItem(Player6_Lbl.getText());
    }
    
    //Sumit created this GIU and worked on this method
    public void playerLbl_update(){
        Player1_Lbl.setText(getPlayerFirstName(1));
        Player2_Lbl.setText(getPlayerFirstName(2));
        Player3_Lbl.setText(getPlayerFirstName(1));
        Player4_Lbl.setText(getPlayerFirstName(3));
        Player5_Lbl.setText(getPlayerFirstName(2));
        Player6_Lbl.setText(getPlayerFirstName(3));
        
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
        MatchScheduler_Lbl = new javax.swing.JLabel();
        Winner_CombBox1 = new javax.swing.JComboBox();
        Winner_CombBox2 = new javax.swing.JComboBox();
        Winner_CombBox3 = new javax.swing.JComboBox();
        ChooseWinner_Lbl = new javax.swing.JLabel();
        Player1_Lbl = new javax.swing.JLabel();
        Player2_Lbl = new javax.swing.JLabel();
        Player3_Lbl = new javax.swing.JLabel();
        Player4_Lbl = new javax.swing.JLabel();
        Player5_Lbl = new javax.swing.JLabel();
        Player6_Lbl = new javax.swing.JLabel();
        Done_CheckBox1 = new javax.swing.JCheckBox();
        Done_CheckBox2 = new javax.swing.JCheckBox();
        Done_CheckBox3 = new javax.swing.JCheckBox();
        goToPlayerRank_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MatchScheduler_Lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MatchScheduler_Lbl.setText("Match Scheduler");

        Winner_CombBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
//        Winner_CombBox1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                //Winner_CombBox1ActionPerformed(evt);
//            }
//        });

        Winner_CombBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Winner_CombBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ChooseWinner_Lbl.setText("Choose Winner");

        Player1_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Player1_Lbl.setText("Player1");

        Player2_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Player2_Lbl.setText("Player2");

        Player3_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Player3_Lbl.setText("Player3");

        Player4_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Player4_Lbl.setText("Player4");

        Player5_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Player5_Lbl.setText("Player5");

        Player6_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Player6_Lbl.setText("Player6");

        Done_CheckBox1.setText("Done");
        Done_CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Done_CheckBox1ActionPerformed(evt);
            }
        });

        Done_CheckBox2.setText("Done");

        Done_CheckBox3.setText("Done");

        goToPlayerRank_Btn.setText("See Player Ranking");
        goToPlayerRank_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToPlayerRank_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Done_CheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Player5_Lbl)
                            .addGap(44, 44, 44)
                            .addComponent(Player6_Lbl)
                            .addGap(39, 39, 39))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Done_CheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Player3_Lbl)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Done_CheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player1_Lbl)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Player2_Lbl)
                            .addComponent(Player4_Lbl))
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Winner_CombBox2, 0, 96, Short.MAX_VALUE)
                    .addComponent(Winner_CombBox1, 0, 96, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Winner_CombBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MatchScheduler_Lbl)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ChooseWinner_Lbl)
                        .addGap(57, 57, 57))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(goToPlayerRank_Btn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MatchScheduler_Lbl)
                .addGap(18, 18, 18)
                .addComponent(ChooseWinner_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Winner_CombBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Done_CheckBox1)
                    .addComponent(Player1_Lbl)
                    .addComponent(Player2_Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player3_Lbl)
                    .addComponent(Player4_Lbl)
                    .addComponent(Winner_CombBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Done_CheckBox2))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Winner_CombBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player6_Lbl)
                    .addComponent(Player5_Lbl)
                    .addComponent(Done_CheckBox3))
                .addGap(34, 34, 34)
                .addComponent(goToPlayerRank_Btn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //isaac did these action listeners
    private void Winner_CombBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Winner_CombBox1ActionPerformed
        // TODO add your handling code here:
    	String player = (String)Winner_CombBox1.getSelectedItem();
    	for(Player p : players) {
    		if(p.getLastName().equals(player)) {
    			p.setWins(p.getWins()+1);
    		}
    	}
    }//GEN-LAST:event_Winner_CombBox1ActionPerformed
    
    private void Winner_CombBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Winner_CombBox2ActionPerformed
        // TODO add your handling code here:
    	String player = (String)Winner_CombBox2.getSelectedItem();
    	for(Player p : players) {
    		if(p.getLastName().equals(player)) {
    			p.setWins(p.getWins()+1);
    		}
    	}
    }//GEN-LAST:event_Winner_CombBox2ActionPerformed
    
    private void Winner_CombBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Winner_CombBox3ActionPerformed
        // TODO add your handling code here:
    	String player = (String)Winner_CombBox3.getSelectedItem();
    	for(Player p : players) {
    		if(p.getLastName().equals(player)) {
    			p.setWins(p.getWins()+1);
    		}
    	}
    }//GEN-LAST:event_Winner_CombBox3ActionPerformed

    String ret[] = new String[3];
    private String[] rank() {
        for (int i = 0; i < 3; i++) {
            if (players.get(i).getWins() == 2)
                ret[0] = players.get(i).getLastName();
            if (players.get(i).getWins() == 1)
                ret[1] = players.get(i).getLastName();
            if (players.get(i).getWins() == 0)
                ret[2] = players.get(i).getLastName();
            else {}
        }
        return ret;
    }

    //Sumit and Jack added this method
    private void goToPlayerRank_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToPlayerRank_BtnActionPerformed
        // TODO add your handling code here:
        String ranking[] = rank();
        PrintWriter write;
        try {
            write = new PrintWriter("GUI_PlayerList.txt");
            write.println(ranking);
            write.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerListFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!isViewed) {
            new PlayerRank().setVisible(true);
            isViewed = true;
        }
        
    }//GEN-LAST:event_goToPlayerRank_BtnActionPerformed

    private void Done_CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Done_CheckBox1ActionPerformed
        // TODO add your handling code here:
		String pl = (String)Winner_CombBox1.getSelectedItem();
		boolean b = false;
		for(Player p : players) {
			if(p.getLastName().equals(pl)) b = true;
		}
		if(b) {
			Done_CheckBox1.setEnabled(false);
			Winner_CombBox1ActionPerformed(evt);
			Winner_CombBox1.setEnabled(false);
		}else {
			Done_CheckBox1.setSelected(false);
		}
    }//GEN-LAST:event_Done_CheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(MatchScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Sumit added things in here
                MatchScheduler matchSchedule = new MatchScheduler();
                matchSchedule.readFromFile();
                matchSchedule.setVisible(true);
                matchSchedule.playerLbl_update();
                matchSchedule.comboBoxUpdate();
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChooseWinner_Lbl;
    private javax.swing.JCheckBox Done_CheckBox1;
    private javax.swing.JCheckBox Done_CheckBox2;
    private javax.swing.JCheckBox Done_CheckBox3;
    private javax.swing.JLabel MatchScheduler_Lbl;
    private javax.swing.JLabel Player1_Lbl;
    private javax.swing.JLabel Player2_Lbl;
    private javax.swing.JLabel Player3_Lbl;
    private javax.swing.JLabel Player4_Lbl;
    private javax.swing.JLabel Player5_Lbl;
    private javax.swing.JLabel Player6_Lbl;
    private javax.swing.JComboBox Winner_CombBox1;
    private javax.swing.JComboBox Winner_CombBox2;
    private javax.swing.JComboBox Winner_CombBox3;
    private javax.swing.JButton goToPlayerRank_Btn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
