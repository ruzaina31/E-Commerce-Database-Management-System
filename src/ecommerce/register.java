/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.Color;
import static java.awt.GridBagConstraints.BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bashi
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register(String name) 
    {
       initComponents();
        jPanel1.setBackground(new Color(0,0,0,130));
        Connect();
        //Update.setVisible(false);
        //Delete.setVisible(false);
        //Cancel2.setVisible(false);
    }
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String Name;
    boolean Signin;
    String ID;
    
    public register(String id,String name,boolean Signin)
    {
      initComponents();
      this.Name=name;
      this.Signin=Signin;
      this.ID=id;
      int UID=Integer.parseInt(ID);
      Connect();
      jPanel1.setBackground(new Color(0,0,0,130));
      
      /*Signup.setVisible(false);
      //Cancel1.setVisible(false);
      Password.setVisible(false);
      jLabel6.setVisible(false);
        
         try{
             
             String sql = "select * from user where u_id= ?";
             ps= con.prepareStatement(sql);
             ps.setInt(1,UID);
             
             ResultSet rs = ps.executeQuery();
             
             if(rs.next()){
                 Username.setText(rs.getString("name"));
                 Phone.setText(rs.getString("phone"));
                 Email.setText(rs.getString("email"));
                 Address.setText(rs.getString("address"));
             }
             //this.setVisible(false);
                    //userpage u=new userpage(name,Signin);
                    //u.setVisible(true);
         }
         catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
           }
         
    */
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        AddressText = new javax.swing.JTextField();
        PasswordText = new javax.swing.JPasswordField();
        Signup = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        emailvalidation = new javax.swing.JLabel();
        PhoneValidationLabel = new javax.swing.JLabel();
        NameValidationLabel = new javax.swing.JLabel();
        AddressValidationLabel = new javax.swing.JLabel();
        PasswordValidationLabel = new javax.swing.JLabel();
        PasswordValidationLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 575));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE ACCOUNT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 330, 43);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 90, 100, 26);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 60, 26);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 190, 60, 26);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 240, 80, 26);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 290, 80, 26);

        UsernameText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        UsernameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UsernameTextKeyReleased(evt);
            }
        });
        jPanel1.add(UsernameText);
        UsernameText.setBounds(130, 90, 220, 28);

        PhoneText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PhoneText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PhoneTextKeyReleased(evt);
            }
        });
        jPanel1.add(PhoneText);
        PhoneText.setBounds(130, 140, 220, 28);

        Email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailKeyReleased(evt);
            }
        });
        jPanel1.add(Email);
        Email.setBounds(130, 190, 220, 28);

        AddressText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(AddressText);
        AddressText.setBounds(130, 240, 220, 28);

        PasswordText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PasswordTextKeyReleased(evt);
            }
        });
        jPanel1.add(PasswordText);
        PasswordText.setBounds(130, 290, 220, 28);

        Signup.setBackground(new java.awt.Color(255, 255, 255));
        Signup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Signup.setText("Sign up");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel1.add(Signup);
        Signup.setBounds(70, 360, 80, 25);

        Cancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);
        Cancel.setBounds(240, 360, 71, 25);

        emailvalidation.setBackground(new java.awt.Color(0, 102, 153));
        emailvalidation.setForeground(new java.awt.Color(255, 0, 0));
        emailvalidation.setOpaque(true);
        emailvalidation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailvalidationKeyReleased(evt);
            }
        });
        jPanel1.add(emailvalidation);
        emailvalidation.setBounds(130, 220, 220, 18);

        PhoneValidationLabel.setBackground(new java.awt.Color(0, 102, 153));
        PhoneValidationLabel.setForeground(new java.awt.Color(255, 0, 0));
        PhoneValidationLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PhoneValidationLabel.setOpaque(true);
        jPanel1.add(PhoneValidationLabel);
        PhoneValidationLabel.setBounds(130, 170, 220, 18);

        NameValidationLabel.setBackground(new java.awt.Color(0, 102, 153));
        NameValidationLabel.setForeground(new java.awt.Color(255, 0, 0));
        NameValidationLabel.setOpaque(true);
        jPanel1.add(NameValidationLabel);
        NameValidationLabel.setBounds(130, 120, 220, 18);

        AddressValidationLabel.setBackground(new java.awt.Color(0, 102, 153));
        AddressValidationLabel.setForeground(new java.awt.Color(255, 0, 0));
        AddressValidationLabel.setOpaque(true);
        jPanel1.add(AddressValidationLabel);
        AddressValidationLabel.setBounds(130, 270, 220, 18);

        PasswordValidationLabel.setBackground(new java.awt.Color(0, 102, 153));
        PasswordValidationLabel.setForeground(new java.awt.Color(255, 0, 0));
        PasswordValidationLabel.setOpaque(true);
        jPanel1.add(PasswordValidationLabel);
        PasswordValidationLabel.setBounds(130, 320, 220, 18);
        jPanel1.add(PasswordValidationLabel2);
        PasswordValidationLabel2.setBounds(130, 340, 220, 0);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 100, 380, 410);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("SHOPPER'S STALL");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 30, 450, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\register blue background 1 resized 11.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1100, 570);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(740, 400, 35, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        new userlogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        // TODO add your handling code here:
        
        
        String name=UsernameText.getText();
        String phone=PhoneText.getText();
        String email=Email.getText();
        String address=AddressText.getText();
        String password=PasswordText.getText();
        
        if(name.isEmpty() || phone.isEmpty() || email.isEmpty() || address.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please fill all details");
            
        }
       else
        {
        
        try{
            String query="insert into user(name,phone,email,address,password)values(?,?,?,?,?)";
             ps=con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
             
             ps.setString(1,name);
             ps.setString(2,phone);
             ps.setString(3,email);
             ps.setString(4,address);
             ps.setString(5,password);
             ps.executeUpdate();
             rs=ps.getGeneratedKeys();
             if(rs.next())
             {
                 JOptionPane.showMessageDialog(this,"Registered successfully!");
                 String uid=rs.getString("u_id");
                 
                 this.setVisible(false);
                 userpage u=new userpage(uid,name,true);
                 u.setVisible(true);
             }
             
             
             
             UsernameText.setText("");
             PhoneText.setText("");
             Email.setText("");
             AddressText.setText("");
             PasswordText.setText("");
        }
             
        catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_SignupActionPerformed
    }
    private void emailvalidationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailvalidationKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_emailvalidationKeyReleased

    private void EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyReleased
        // TODO add your handling code here:
         String PATTERN ="^[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";//"^[a-zA-Z0-9]{0,30}@[a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(Email.getText());
        if(!match.matches())
        {
            emailvalidation.setText("Email Is Invalid!");
        }
        else 
        {
            emailvalidation.setText(null);
        }
    }//GEN-LAST:event_EmailKeyReleased

    private void PhoneTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneTextKeyReleased
        // TODO add your handling code here:
        String PATTERN ="^[0-9]{10}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(PhoneText.getText());
        if(!match.matches())
        {
            PhoneValidationLabel.setText("Phone number is invalid!");
        }
        else
        {
            PhoneValidationLabel.setText(null);
        }
    }//GEN-LAST:event_PhoneTextKeyReleased

    private void UsernameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameTextKeyReleased
        // TODO add your handling code here:
        String PATTERN ="^[a-zA-Z\\s]{0,120}$";//"^[A-Za-z]+[ '-][A-Za-z][ '-][A-Za-z]+{0,120}$";//[A-Z]+([ '-][a-zA-Z]+)
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(UsernameText.getText());
        if(!match.matches())
        {
            NameValidationLabel.setText("Name is Invalid!");
            
        }
        else 
        {
            NameValidationLabel.setText(null);

        }
    }//GEN-LAST:event_UsernameTextKeyReleased

    private void PasswordTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextKeyReleased
        // TODO add your handling code here:
        String PATTERN ="^[a-zA-Z0-9!@#$%^&*_+-=]{8,10}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(PasswordText.getText());
        if(!match.matches()){
            PasswordValidationLabel.setText("Must Contain 8-10 characters only!!!");
        
            String PAT ="^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,256}$";  
             //eg.it will accept srtong passwd like Sumaaiya@123(uppercase, lower, symbol and numbers)String PATTERN ="^[a-zA-Z0-9!@#$%^&*_+-=]{8,10}";
            Pattern pa = Pattern.compile(PAT);
            Matcher ma = pa.matcher(PasswordText.getText());
            if(!ma.matches()){
                PasswordValidationLabel2.setText("Weak Password!!!");
             }
            else{
            PasswordValidationLabel2.setText(null);
        }
        }
        else{
            PasswordValidationLabel.setText(null);
        }
    }//GEN-LAST:event_PasswordTextKeyReleased

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressText;
    private javax.swing.JLabel AddressValidationLabel;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel NameValidationLabel;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel PasswordValidationLabel;
    private javax.swing.JLabel PasswordValidationLabel2;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JLabel PhoneValidationLabel;
    private javax.swing.JButton Signup;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel emailvalidation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}