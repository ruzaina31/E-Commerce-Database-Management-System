/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import javax.swing.JOptionPane;
//import ecommerce.Home;
import ecommerce.userpage;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;


/**
 *
 * @author bashi
 */
public class userlogin extends javax.swing.JFrame {

    /**
     * Creates new form user login
     */
    
    public userlogin() {
        initComponents();
        
        Connect();
        jPanel1.setBackground(new Color(65,131,215,100));
        
    }
    
    Connection con;
    PreparedStatement ps; 
    ResultSet rs;
    boolean Signin;
     
    
    public void Connect()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/ecommerce","root","anjum2000");
        }
        catch(ClassNotFoundException ex)
        {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE,null,ex);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE,null,ex);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        ClickHere = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 575));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\gender-neutral-user login symbol.png")); // NOI18N
        jLabel1.setText("USER LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 300, 60);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 120, 100, 26);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 180, 90, 26);

        Username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(Username);
        Username.setBounds(120, 120, 210, 30);

        Password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password);
        Password.setBounds(120, 180, 210, 30);

        Login.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login);
        Login.setBounds(60, 250, 80, 25);

        Cancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);
        Cancel.setBounds(210, 250, 71, 25);

        ClickHere.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ClickHere.setText("Click here");
        ClickHere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickHereActionPerformed(evt);
            }
        });
        jPanel1.add(ClickHere);
        ClickHere.setBounds(220, 320, 81, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Don't have an account?");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 320, 131, 15);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(380, 120, 350, 360);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("SHOPPER'S STALL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 40, 480, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/online-shopping-e-commerce-concept-background resized 3.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1110, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClickHereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickHereActionPerformed
        // TODO add your handling code here:
        register r=new register("");
        r.setVisible(true);
        this.setVisible(false);
      
    }//GEN-LAST:event_ClickHereActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        Signin=false;
        userpage u=new userpage("",Signin);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String name=Username.getText();
        String password=Password.getText();
        
        
        
        Connect();
         if(name.isEmpty() || password.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the details !!!!");
        }
         else
         {
            try
           {
            
            ps=con.prepareStatement("select * from user where name=? and password=?");
            ps.setString(1,name);
            ps.setString(2,password);
            
            
            rs=ps.executeQuery();
            if(rs.next())
            { 
              JOptionPane.showMessageDialog(this,"Login Successfull!!!!");
              Signin=true;
              String uid=rs.getString("u_id");
              this.hide();
              userpage u=new userpage(uid,name,Signin);
              u.setVisible(true);
              
              
            }
            else
            {  
               JOptionPane.showMessageDialog(this,"Invalid Username or Password!!!");
               Username.setText("");
               Password.setText("");
            }
           }
        catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_LoginActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

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
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton ClickHere;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
