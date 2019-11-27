/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nierema_sd2081
 */
public class ListUser extends javax.swing.JFrame {
    public String user;
    /**
     * Creates new form listUser
     */
    public ListUser() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        showList = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        snd = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        em = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ps1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        frst = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        ps2 = new javax.swing.JTextArea();
        dlt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("List of Users");

        showList.setText("Show List");
        showList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showListMouseClicked(evt);
            }
        });

        snd.setColumns(20);
        snd.setRows(5);
        jScrollPane2.setViewportView(snd);

        lst.setColumns(20);
        lst.setRows(5);
        jScrollPane3.setViewportView(lst);

        em.setColumns(20);
        em.setRows(5);
        jScrollPane4.setViewportView(em);

        ps1.setColumns(20);
        ps1.setRows(5);
        jScrollPane5.setViewportView(ps1);

        frst.setColumns(20);
        frst.setRows(5);
        jScrollPane6.setViewportView(frst);

        ps2.setColumns(20);
        ps2.setRows(5);
        jScrollPane7.setViewportView(ps2);

        dlt.setText("Delete");
        dlt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dltMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(showList)
                        .addGap(143, 143, 143)
                        .addComponent(dlt)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showList)
                    .addComponent(dlt))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showListMouseClicked
        // TODO add your handling code here:
        try
        {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/niere";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, "root", "");

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("select * from userlist");
            
            while (rs.next())
            {
                frst.append(rs.getString("firstname"));
                frst.append("\n");
                snd.append(rs.getString("middlename"));
                snd.append("\n");
                lst.append(rs.getString("lastname"));
                lst.append("\n");
                em.append(rs.getString("email"));
                em.append("\n");
                ps1.append(rs.getString("password"));
                ps1.append("\n");
                ps2.append(rs.getString("repass"));
                ps2.append("\n");
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.err.println("Got an exception");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_showListMouseClicked

    private void dltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dltMouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        int dialResult = JOptionPane.showConfirmDialog(null,  "Delete account?");
        
        if(dialResult == JOptionPane.YES_OPTION)
        {
            try
            {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost/niere";
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(url, "root", "");
                
                String wantToDelete = JOptionPane.showInputDialog("What account you want to delete?");

                Statement st = conn.createStatement();

                st.executeUpdate("delete from userlist where firstname=(" + "'" + wantToDelete + "'" + ");");
                JOptionPane.showMessageDialog(null, "Successfully deleted!");
                this.dispose();
                log.setVisible(true);

                conn.close();

            }
            catch(Exception e)
            {
                System.err.println("Got an exception");
                System.err.println(e.getMessage());
            }
        }
        else
        {
            this.dispose();
            log.setVisible(true);
        }
        
    }//GEN-LAST:event_dltMouseClicked

    
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
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dlt;
    private javax.swing.JTextArea em;
    private javax.swing.JTextArea frst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea lst;
    private javax.swing.JTextArea ps1;
    private javax.swing.JTextArea ps2;
    private javax.swing.JButton showList;
    private javax.swing.JTextArea snd;
    // End of variables declaration//GEN-END:variables
}
