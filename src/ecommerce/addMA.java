/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author bashi
 */
public class addMA extends javax.swing.JFrame {

    /**
     * Creates new form addMA
     */
    public addMA() {
        Connect();
        initComponents();
        jPanel1.setBackground(new Color(242, 38, 19, 50));
    }
    
    Connection con;
    PreparedStatement ps; 
    ResultSet rs;
    String Category;
    int CID;
    String name;
    String ID;
    boolean Signin;

    
    public addMA(String name,boolean Signin,int CID,String Category) {
        initComponents();
        Connect();
        jPanel1.setBackground(new Color(248, 38, 19, 120));
        
        this.name=jLabel7.getText();;
        this.Signin=Signin;
        this.CID=CID;
        this.Category=Category;
        ID=jLabel5.getText();
        
      /*  if(this.name=="Ruksar") 
       {
         //jSpinner1.setVisible(false);
         //jLabel5.setVisible(false);
         //AddToCart.setVisible(false);
         //Cancel1.setVisible(false);
         path.setVisible(false);
           AddProductButton.setVisible(true);
           DeleteProductButton.setVisible(true);
           UpdateProductButton.setVisible(true);
           Cancel2.setVisible(true);
           path.setVisible(true);
       }
       else if(this.name=="Ruzaina")
       {
           //jSpinner1.setVisible(false);
           //jLabel5.setVisible(false);
           //AddToCart.setVisible(false);
           //Cancel1.setVisible(false);
           path.setVisible(false);
           AddProductButton.setVisible(true);
           DeleteProductButton.setVisible(true);
           UpdateProductButton.setVisible(true);
           Cancel2.setVisible(true);
           path.setVisible(true);
       }
        else
       {
           AddProductButton.setVisible(false);
           DeleteProductButton.setVisible(false);
           UpdateProductButton.setVisible(false);
           Cancel2.setVisible(false);
           path.setVisible(false);
       }*/
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
        Upload = new javax.swing.JButton();
        path = new javax.swing.JLabel();
        AddProductButton = new javax.swing.JButton();
        Cancel2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        UpdateProductButton = new javax.swing.JButton();
        DeleteProductButton = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        pic = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1110, 580));
        setMinimumSize(new java.awt.Dimension(1110, 580));
        setPreferredSize(new java.awt.Dimension(1110, 580));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1100, 575));
        jPanel1.setMinimumSize(new java.awt.Dimension(1100, 575));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 575));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Product Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 60, 120, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Description");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 160, 90, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Price");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 280, 40, 20);

        pname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel1.add(pname);
        pname.setBounds(130, 60, 250, 28);

        cost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cost.setMaximumSize(new java.awt.Dimension(7, 21));
        cost.setMinimumSize(new java.awt.Dimension(7, 21));
        cost.setPreferredSize(new java.awt.Dimension(7, 21));
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });
        jPanel1.add(cost);
        cost.setBounds(130, 280, 250, 28);

        Upload.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Upload.setText("Upload");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });
        jPanel1.add(Upload);
        Upload.setBounds(470, 10, 113, 25);

        path.setText("                                Path name");
        path.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(path);
        path.setBounds(400, 340, 260, 20);

        AddProductButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddProductButton.setText("Add Product");
        AddProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddProductButton);
        AddProductButton.setBounds(30, 400, 130, 25);

        Cancel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cancel2.setText("Cancel");
        Cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel2ActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel2);
        Cancel2.setBounds(520, 400, 130, 25);

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 120, 250, 120);

        UpdateProductButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateProductButton.setText("Update Product");
        UpdateProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProductButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateProductButton);
        UpdateProductButton.setBounds(190, 400, 140, 25);

        DeleteProductButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteProductButton.setText("Delete Product");
        DeleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteProductButton);
        DeleteProductButton.setBounds(360, 400, 130, 25);

        pic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane2.add(pic);
        pic.setBounds(0, 0, 250, 270);

        jPanel1.add(jDesktopPane2);
        jDesktopPane2.setBounds(400, 50, 250, 270);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 50, 670, 440);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 20, 80, 20);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 20, 80, 20);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 20, 80, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\Backdrops\\addma selected row resized.jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1100, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        // TODO add your handling code here:
       JFileChooser chooser=new JFileChooser();
        //FileNameExtensionFilter fef=new FileNameExtensionFilter("Images","jpg","png","jpeg");
        //chooser.addChoosableFileFilter(fef);
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        path.setText(filename);
        
        ImageIcon imageicon=new ImageIcon(f.toString());
              //Resize image to fit jLabel
        Image imageFit = imageicon.getImage().getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_SMOOTH);
        pic.setIcon(new ImageIcon(imageFit));

        
            
        
    }//GEN-LAST:event_UploadActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void Cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel2ActionPerformed
        // TODO add your handling code here:
                this.setVisible(false);
   /*      if(Category=="Mobiles and Accessories")
     {
        MobilesAndAccessories ma=new MobilesAndAccessories(name,Signin);
        ma.setVisible(true);
        this.setVisible(false);
     }
        else if(Category=="Household and Kitchen Appliances")
     {
        HouseholdAndKitchen hk=new HouseholdAndKitchen(name,Signin);
        hk.setVisible(true);
        this.setVisible(false);
    } 
     else if(Category=="Grocery")
     {
        Groceries g=new Groceries(name,Signin);
        g.setVisible(true);
        this.setVisible(false);
    }
     else if(Category=="Furniture")
     {
         Furniture f = new Furniture(name,Signin);
         f.setVisible(true);
         this.setVisible(false);
     }
     else if(Category=="Books and Stationery")
     {
         BooksAndStationery b=new BooksAndStationery(name,Signin);
         b.setVisible(true);
         this.setVisible(false);
     }
     else if(Category=="Daily Essentials")
     {
         DailyEssentials de=new DailyEssentials(name,Signin);
         de.setVisible(true);
         this.setVisible(false);
     }*/
    }//GEN-LAST:event_Cancel2ActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void UpdateProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProductButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            String ProductName=pname.getText();
            String Description=desc.getText();
            int Price=Integer.parseInt(cost.getText());
            String Pathname=path.getText();
            String Pid=jLabel6.getText();
            
            ps=con.prepareStatement("update products set p_name=?,description=?,price=?,pathname=? where p_id=?");
            
            ps.setString(1,ProductName);
            ps.setString(2,Description);
            ps.setInt(3,Price);
            ps.setString(4,Pathname);
            ps.setString(5,Pid);
      
            ps.executeUpdate();
            
             JOptionPane.showMessageDialog(this,"Product Updated!!");
       
            pname.setText("");
            desc.setText("");
            path.setText("path");
            cost.setText("");
            pic.setText("image");
            pic.setIcon(null);
            jLabel6.setText("");
            this.setVisible(false);
            
            AddProductButton.setEnabled(false);
        }

        catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_UpdateProductButtonActionPerformed

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButtonActionPerformed
        // TODO add your handling code here:
        try
        {
           
            String ProductName=pname.getText();
            String Description=desc.getText();
            int Price=Integer.parseInt(cost.getText());
            String Pathname=path.getText();
            File image=new File(path.getText());
            InputStream in= new FileInputStream(path.getText());
            FileOutputStream fos=new FileOutputStream(image);
            
            ps=con.prepareStatement("insert into products(p_name,description,c_id,price,category,pathname) values(?,?,?,?,?,?)");
            ps.setString(1,ProductName);
            ps.setString(2,Description);
            ps.setInt(3,CID);
            ps.setInt(4,Price);
            ps.setString(5,Category);
            ps.setString(6,Pathname);
           
            

            ps.executeUpdate();
            
             JOptionPane.showMessageDialog(this,"Product Added!!");
                     
            pname.setText("");
            desc.setText("");
            cost.setText("");
            path.setText("path");
            pic.setText("image");
            pic.setIcon(null);
            
        }

        catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MobilesAndAccessories.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AddProductButtonActionPerformed

    private void DeleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductButtonActionPerformed
        // TODO add your handling code here:
        String Pid=jLabel6.getText();
        int opt=JOptionPane.showConfirmDialog(null,"Are you sure to delete?","Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0)
        {
         try
         {
            ps=con.prepareStatement("delete from products where p_id=?");
            ps.setString(1,Pid);
            ps.executeUpdate();
             JOptionPane.showMessageDialog(this,"Product Deleted!!");
             
            pname.setText("");
            desc.setText("");
            path.setText("path");
            cost.setText("");
            pic.setText("image");
            pic.setIcon(null);
            this.setVisible(false);
            
           
            //AddProductButton.setEnabled(false);
        } 
        catch(SQLException ex)
        {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE,null,ex);
        }
        }

    }//GEN-LAST:event_DeleteProductButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddProductButton;
    private javax.swing.JButton Cancel2;
    public javax.swing.JButton DeleteProductButton;
    public javax.swing.JButton UpdateProductButton;
    private javax.swing.JButton Upload;
    public javax.swing.JTextField cost;
    public javax.swing.JTextArea desc;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel path;
    public javax.swing.JLabel pic;
    public javax.swing.JTextField pname;
    // End of variables declaration//GEN-END:variables
byte[] photo=null;
String filename=null;


}
