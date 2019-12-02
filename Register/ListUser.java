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
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nierema_sd2081
 */
public class ListUser extends javax.swing.JFrame {
    public String name;
    
    public String curFname;
    public String curMname;
    public String curLname;
    public String curEmail;
    public String curPass;
    public String curRepass;
    
    public ListUser() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        it = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

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

        it.setText("Edit");
        it.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List Of Users");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showList)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(it)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dlt)
                                .addGap(45, 45, 45)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(it)
                    .addComponent(dlt)
                    .addComponent(showList))
                .addGap(20, 20, 20))
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
                ps2.append(rs.getString("repassword"));
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

    private void itMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itMouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        
        String firstName;
        String lastName;
        String middle;
        String email;
        String confirmPass;

        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = {"firstname", "lastname", "middlename", "email", "password"};
        String initialSelection = "First Name";
        Object selection = JOptionPane.showInputDialog(null, "What do you want to edit?",
                "Edit", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/niere";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            
            String wantToEdit = JOptionPane.showInputDialog("Who do you want to edit?");

            Statement st = conn.createStatement();

            
            if ("firstname".equals((String) selection)) {
                firstName = JOptionPane.showInputDialog("First Name");
                st.executeUpdate("update userlist set firstname = (" + "'" + firstName + "'" + ") where firstname = (" + "'" + wantToEdit + "'" + ");");
                System.out.println(name);
                this.dispose();
                log.setVisible(true);
            } else if ("lastname".equals((String) selection)) {
                lastName = JOptionPane.showInputDialog("Last Name");
                st.executeUpdate("update userlist set lastname = (" + "'" + lastName + "'" + ") where firstname = (" + "'" + wantToEdit + "'" + ");");
                this.dispose();
                log.setVisible(true);
            } else if ("middlename".equals((String) selection)) {
                middle = JOptionPane.showInputDialog("Middle Name");
                st.executeUpdate("update userlist set middlename = (" + "'" + middle + "'" + ") where firstname = (" + "'" + wantToEdit + "'" + ");");
                this.dispose();
                log.setVisible(true);
            } else if ("email".equals((String) selection)) {
                email = JOptionPane.showInputDialog("E-Mail");
                st.executeUpdate("update userlist set email = (" + "'" + email + "'" + ") where firstname = (" + "'" + wantToEdit + "'" + ");");
                this.dispose();
                log.setVisible(true);
            } else if ("password".equals((String) selection)) {
                String currentPass = JOptionPane.showInputDialog("Current Password");
                while (true) {
                    if (!currentPass.equals(curPass)) {
                        JOptionPane.showMessageDialog(null, "We are asking for your current password!");
                        currentPass = JOptionPane.showInputDialog("Current Password");
                    } else {
                        confirmPass = JOptionPane.showInputDialog("New Password");
                        st.executeUpdate("update userlist set newpassword = (" + "'" + confirmPass + "'" + "), repassword = (" + "'" + confirmPass + "'" + ") where firstname = (" + "'" + wantToEdit + "'" + ");");
                        this.dispose();
                        log.setVisible(true);
                        break;
                    }
                }

            }
            conn.close();

        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_itMouseClicked

    
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
    private javax.swing.JButton it;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
