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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author bashi
 */
public class Order1 extends javax.swing.JFrame {

    /**
     * Creates new form Order1
     */
    public Order1() {
        initComponents();
        Connect();
 //orders1Table();
 orders1Table.setBackground(new Color(252, 214, 112, 1));

    }
    Connection con;
 PreparedStatement ps;  ResultSet rs;
 int ID;
 String Name;
 boolean Signin;
 
  public Order1(int id) {
 initComponents();
 Connect();
 
 this.ID=id;
 orders1Table(ID);
 //jLabel4.setText(String.valueOf(ID));
 orders1Table.setBackground(new Color(252, 214, 112, 1));
 }
  
   public void Connect()
 {
 try{
 Class.forName("com.mysql.cj.jdbc.Driver");
 con = 
DriverManager.getConnection("jdbc:mysql://localhost/ecommerce","root","anjum2000"); }
 catch(ClassNotFoundException ex)
 {Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
 }
 catch (SQLException ex) {
 Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
   
    public void orders1Table(int id)
 {
 int user_id=id;
 
 //int U_ID=Integer.parseInt(jTextField2.getText());
 orders1Table.getColumnModel().getColumn(0).setPreferredWidth(0);
 orders1Table.getColumnModel().getColumn(1).setPreferredWidth(80);
 orders1Table.getColumnModel().getColumn(2).setPreferredWidth(80);
 
 DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
 centerRenderer.setHorizontalAlignment(JLabel.CENTER);
 orders1Table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
 orders1Table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
 
 try
 { 
 
 ps=con.prepareStatement("select * from cart1 where u_id=?");
 ps.setInt(1,user_id);
 rs=ps.executeQuery(); 
 ResultSetMetaData Rsm=rs.getMetaData();
 int c;
 c=Rsm.getColumnCount();
 
 DefaultTableModel d1=(DefaultTableModel)orders1Table.getModel();
 d1.setRowCount(0);
 
 while(rs.next())
 {
 Vector v2=new Vector();
 for(int i=1;i<=c;i++)
 {
 v2.add(rs.getInt("u_id"));
 v2.add(rs.getInt("p_id"));
 v2.add(rs.getInt("quantity"));
 }
 d1.addRow(v2);
 
 }
 } catch (SQLException ex) {
 Logger.getLogger(MobilesAndAccessories.class.getName()).log(Level.SEVERE, null, ex);
 } 
 }
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 this.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orders1Table = new javax.swing.JTable();
        Close = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 400));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ORDER ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 19, 98, 26);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CUSTOMER ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(402, 19, 146, 26);

        orders1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "uid", "Product ID", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orders1Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 87, 452, 290);

        Close.setBackground(new java.awt.Color(255, 204, 204));
        Close.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Close);
        Close.setBounds(743, 370, 90, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 20, 110, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(550, 20, 120, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\Backdrops\\Order1 resized.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 850, 400);

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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JTable orders1Table;
    // End of variables declaration//GEN-END:variables
}