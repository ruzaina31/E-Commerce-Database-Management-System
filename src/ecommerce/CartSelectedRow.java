/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author bashi
 */
public class CartSelectedRow extends javax.swing.JFrame {

    /**
     * Creates new form CartSelectedRow
     */
    
        Connection con;
    PreparedStatement ps; 
    ResultSet rs;
    boolean Signin;
    String Name;
    String ID;

    public CartSelectedRow() {
        initComponents();
    }
    
        public CartSelectedRow(String id,String name,boolean Signin) {
        initComponents();
        Connect();
        //jPanel1.setBackground(new Color(248,38,19,150));
      this.Name=name;
      this.Signin=Signin;
       this.ID=id; 
       jLabel7.setVisible(false);
       totcost.setVisible(false);
       jPanel1.setBackground(new Color(75,119,190,100));
      
    }
        
       public void Connect()
      {
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/ecommerce","root","anjum2000");
              }
          catch(ClassNotFoundException ex)
              {Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
               }
          catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
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
        pname = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        quan = new javax.swing.JSpinner();
        Update = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totcost = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 330));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Product Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(19, 23, 139, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Quantity");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 81, 139, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Price");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(19, 143, 139, 26);
        jPanel1.add(pname);
        pname.setBounds(176, 23, 193, 29);
        jPanel1.add(cost);
        cost.setBounds(176, 143, 193, 26);
        jPanel1.add(quan);
        quan.setBounds(176, 84, 68, 30);

        Update.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(408, 23, 91, 29);

        Remove.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        jPanel1.add(Remove);
        Remove.setBounds(408, 83, 91, 29);

        Cancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);
        Cancel.setBounds(408, 140, 91, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 70, 518, 201);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 20, 130, 30);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 20, 190, 30);
        getContentPane().add(totcost);
        totcost.setBounds(560, 270, 110, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 270, 110, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\Backdrops\\CartSelectedRow resized.jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 830, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
                ID=jLabel6.getText();
         MyCart cart=new MyCart(ID,Name,Signin);
         this.setVisible(false);
         cart.setVisible(true);

    }//GEN-LAST:event_CancelActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
                int UID=Integer.parseInt(jLabel6.getText());
        int PID=Integer.parseInt(jLabel5.getText());
        ID=jLabel6.getText();
        try
        {
            
            int Quantity=Integer.parseInt(quan.getValue().toString());
            int Price=Integer.parseInt(cost.getText());
            int TotalPrice=Quantity * Price;
            
            ps=con.prepareStatement("update cart set price=?,quantity=?,totalPrice=? where p_id=? and u_id=?");
            
            ps.setInt(1,Price);
            ps.setInt(2,Quantity);
            ps.setInt(3,TotalPrice);
            ps.setInt(4,PID);
            ps.setInt(5,UID);
      
            ps.executeUpdate();
            
             JOptionPane.showMessageDialog(this,"Cart Updated!!");
             
             this.setVisible(false);
             MyCart cart=new MyCart(ID,Name,Signin);
             cart.setVisible(true);
        }
        catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_UpdateActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
               int UID=Integer.parseInt(jLabel6.getText());
        int PID=Integer.parseInt(jLabel5.getText());
        ID=jLabel6.getText();
        
        //int UID=Integer.parseInt(jLabel6.getText());
        //String pid=jLabel5.getText();
        //int PID=Integer.parseInt(pid);
        int opt=JOptionPane.showConfirmDialog(null,"Are you sure to Remove?","Remove Product",JOptionPane.YES_NO_OPTION);
        if(opt==0)
        {
         try
       {
            ps=con.prepareStatement("delete from cart where p_id=? and u_id=?");
            ps.setInt(1,PID);
            ps.setInt(2,UID);
            
            ps.executeUpdate();
             JOptionPane.showMessageDialog(this,"Product Removed from cart!!");
             
             MyCart cart=new MyCart(ID,Name,Signin);
             this.setVisible(false);
             cart.setVisible(true);
            
       }
       catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}
    
    }//GEN-LAST:event_RemoveActionPerformed

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
            java.util.logging.Logger.getLogger(CartSelectedRow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartSelectedRow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartSelectedRow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartSelectedRow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartSelectedRow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Update;
    public javax.swing.JTextField cost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField pname;
    public javax.swing.JSpinner quan;
    public javax.swing.JLabel totcost;
    // End of variables declaration//GEN-END:variables
}
