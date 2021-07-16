/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

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
public class userpage extends javax.swing.JFrame {

    /**
     * Creates new form user page
     */
    public userpage() {
        initComponents();
        Connect();
        
        
    }
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    boolean Signin;
    String name;
    String role;
    int U_ID;
    String ID;
    
    
    
    
    
    public userpage(String name,boolean Signin)
    {
        initComponents();
        Connect();
        
        this.Signin=Signin;
        this.name=name;
        More.setVisible(false);
        
         try
           {
            
            ps=con.prepareStatement("select * from user where name=?");
            ps.setString(1,name);
            
            
            
            rs=ps.executeQuery();
            if(rs.next())
            { 
              ID=rs.getString("u_id");
              
            }
           }
        catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         if(Signin==false)
      {   
          More.setVisible(false);
          EditProfile.setVisible(false);
          Logout.setVisible(false);
          Signup.setVisible(true);
          Login.setVisible(true);
          
      }
      else if(Signin==true)
        {
          Signup.setVisible(false);
          Login.setVisible(false);
          
         }
         
               /*if(Name.equals("Ruksar") || Name.equals("Ruzaina"))
        {
            MyCart.setVisible(false);
            
            DeleteProduct.setVisible(true);
            UpdateProduct.setVisible(true);
            AddProduct.setVisible(true);         
        }
        
        else
        {
            More.setVisible(false);
            DeleteProduct.setVisible(false);
            UpdateProduct.setVisible(false);
            AddProduct.setVisible(false);         
        }*/
        
      
       /* if(name.equals("Ruksar")){
            More.setVisible(true);
            DeleteProduct.setVisible(true);
            UpdateProduct.setVisible(true);
            AddProduct.setVisible(true);
          
            //EditMA.setVisible(true);
            //EditHK.setVisible(true);
            //EditFur.setVisible(true);
            //EditBook.setVisible(true);
            //EditG.setVisible(true);
            //EditDE.setVisible(true);
        }
        else if(name.equals("Ruzaina")){
            More.setVisible(true);
            DeleteProduct.setVisible(true);
            UpdateProduct.setVisible(true);
            AddProduct.setVisible(true);
            //EditMA.setVisible(true);
            //EditHK.setVisible(true);
            //EditFur.setVisible(true);
            //EditBook.setVisible(true);
            //EditG.setVisible(true);
            //EditDE.setVisible(true);
        }
        else{
            More.setVisible(false);
            DeleteProduct.setVisible(false);
            UpdateProduct.setVisible(false);
            AddProduct.setVisible(false);
            //EditMA.setVisible(false);
            //EditHK.setVisible(false);
            //EditFur.setVisible(false);
            //EditBook.setVisible(false);
            //EditG.setVisible(false);
            //EditDE.setVisible(false);
       }*/
       /* if(Signin==false){
            EditProfile.setVisible(false);
            Logout.setVisible(false);
            Signup.setVisible(true);
            Login.setVisible(true);
        }
        else if(Signin==true){
            Signup.setVisible(false);
            Login.setVisible(false);
        }*/
        
    }
    public  userpage(String id,String name,boolean Signin) 
    {
        initComponents();
        Connect();
        
        this.ID=id;
        this.name=name;
       this.Signin=Signin;
       
       
      if(Signin==false)
      {   
          More.setVisible(false);
          EditProfile.setVisible(false);
          Logout.setVisible(false);
          Signup.setVisible(true);
          Login.setVisible(true);
      }
      else if(Signin==true)
        {
          Signup.setVisible(false);
          Login.setVisible(false);
         }
       
       
      if(name.equals("Ruksar") || name.equals("Ruzaina"))
        {
            MyCart.setVisible(false);
            DeleteProduct.setVisible(true);
            UpdateProduct.setVisible(true);
            AddProduct.setVisible(true);         
        }
        
        else
        {
            More.setVisible(false);
            DeleteProduct.setVisible(false);
            UpdateProduct.setVisible(false);
            AddProduct.setVisible(false);         
        }
    }
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MobilesAccessories = new javax.swing.JButton();
        HouseholdAndKitchenAppliances = new javax.swing.JButton();
        Furniture = new javax.swing.JButton();
        BooksAndStationery = new javax.swing.JButton();
        Grocery = new javax.swing.JButton();
        DailyEssentials = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Profile = new javax.swing.JMenu();
        Signup = new javax.swing.JMenuItem();
        Login = new javax.swing.JMenuItem();
        EditProfile = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MyCart = new javax.swing.JMenu();
        GoToCart = new javax.swing.JMenuItem();
        More = new javax.swing.JMenu();
        AddProduct = new javax.swing.JMenuItem();
        UpdateProduct = new javax.swing.JMenuItem();
        DeleteProduct = new javax.swing.JMenuItem();
        ViewOrder = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("SHOPPER'S STALL");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(470, 70, 470, 70);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Experience the most simple way of shopping!");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(530, 150, 530, 34);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/ecommerce banner2 resized.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1100, 260);

        MobilesAccessories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/Mobile and accessories resized.jpeg"))); // NOI18N
        MobilesAccessories.setText("jButton1");
        MobilesAccessories.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MobilesAccessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobilesAccessoriesActionPerformed(evt);
            }
        });
        jDesktopPane1.add(MobilesAccessories);
        MobilesAccessories.setBounds(10, 300, 170, 170);

        HouseholdAndKitchenAppliances.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/household and kitchen appliances resized1.jpeg"))); // NOI18N
        HouseholdAndKitchenAppliances.setText("jButton2");
        HouseholdAndKitchenAppliances.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HouseholdAndKitchenAppliances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseholdAndKitchenAppliancesActionPerformed(evt);
            }
        });
        jDesktopPane1.add(HouseholdAndKitchenAppliances);
        HouseholdAndKitchenAppliances.setBounds(190, 300, 170, 170);

        Furniture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/Furniture icon 2 resized.png"))); // NOI18N
        Furniture.setText("jButton3");
        Furniture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Furniture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FurnitureActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Furniture);
        Furniture.setBounds(370, 300, 170, 170);

        BooksAndStationery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/books-stationery-management-software resized.jpg"))); // NOI18N
        BooksAndStationery.setText("jButton4");
        BooksAndStationery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BooksAndStationery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksAndStationeryActionPerformed(evt);
            }
        });
        jDesktopPane1.add(BooksAndStationery);
        BooksAndStationery.setBounds(550, 300, 170, 170);

        Grocery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/grocery-&-staples 3 resized.png"))); // NOI18N
        Grocery.setText("jButton5");
        Grocery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Grocery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroceryActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Grocery);
        Grocery.setBounds(730, 300, 170, 170);

        DailyEssentials.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/daily appliances 1 resized.jpeg"))); // NOI18N
        DailyEssentials.setText("jButton6");
        DailyEssentials.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DailyEssentials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyEssentialsActionPerformed(evt);
            }
        });
        jDesktopPane1.add(DailyEssentials);
        DailyEssentials.setBounds(910, 300, 170, 170);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Categories");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(20, 260, 150, 34);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Mobiles and Accessories");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(10, 470, 170, 21);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Household and ");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(220, 470, 110, 21);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Kitchen Appliances");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(210, 490, 130, 21);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Furniture");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(420, 470, 70, 21);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Books and Stationery");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(560, 470, 160, 21);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Grocery");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(780, 470, 60, 20);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Daily Essentials");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(940, 470, 120, 21);

        jMenu1.setBackground(new java.awt.Color(153, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 51));
        jMenu1.setText("                   SHOPPER'S STALL");
        jMenu1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setPreferredSize(new java.awt.Dimension(500, 20));
        jMenuBar1.add(jMenu1);

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/icons8-male-user-24.png"))); // NOI18N
        Profile.setText("Profile");
        Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/icons8-add-user-male-24.png"))); // NOI18N
        Signup.setText("Sign up");
        Signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        Profile.add(Signup);

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/icons8-login-24.png"))); // NOI18N
        Login.setText("Login");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        Profile.add(Login);

        EditProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/icons8-edit-user-24.png"))); // NOI18N
        EditProfile.setText("Edit Profile");
        EditProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });
        Profile.add(EditProfile);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/icons8-logout-rounded-left-24.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Profile.add(Logout);
        Profile.add(jSeparator1);

        jMenuBar1.add(Profile);

        MyCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecommerce/icons8-shopping-cart-24.png"))); // NOI18N
        MyCart.setText("My Cart");
        MyCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyCartActionPerformed(evt);
            }
        });

        GoToCart.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\icons8-shopping-cart-16.png")); // NOI18N
        GoToCart.setText("Go To Cart");
        GoToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToCartActionPerformed(evt);
            }
        });
        MyCart.add(GoToCart);

        jMenuBar1.add(MyCart);

        More.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\icons8-pull-down-24.png")); // NOI18N
        More.setText("More");

        AddProduct.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\icons8-add-property-24.png")); // NOI18N
        AddProduct.setText("Add Product");
        AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductActionPerformed(evt);
            }
        });
        More.add(AddProduct);

        UpdateProduct.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\icons8-update-24.png")); // NOI18N
        UpdateProduct.setText("Update Product");
        UpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProductActionPerformed(evt);
            }
        });
        More.add(UpdateProduct);

        DeleteProduct.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\icons8-remove-24.png")); // NOI18N
        DeleteProduct.setText("Delete Product");
        DeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductActionPerformed(evt);
            }
        });
        More.add(DeleteProduct);

        ViewOrder.setIcon(new javax.swing.ImageIcon("C:\\Users\\bashi\\OneDrive\\Desktop\\Ruzaina Files\\DBMS Project\\Icons and images\\icons8-view-schedule-24.png")); // NOI18N
        ViewOrder.setText("View Orders");
        ViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrderActionPerformed(evt);
            }
        });
        More.add(ViewOrder);

        jMenuBar1.add(More);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        // TODO add your handling code here:
        register r=new register("");
        r.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_SignupActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        userlogin u=new userlogin();
        u.setVisible(true);
  
    }//GEN-LAST:event_LoginActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        Signin=false;
        this.setVisible(false);
        userpage u = new userpage("",Signin);
        u.setVisible(true);
        
    }//GEN-LAST:event_LogoutActionPerformed

    private void FurnitureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FurnitureActionPerformed
        // TODO add your handling code here:
        Furniture f=new Furniture(ID,name,Signin);
         jDesktopPane1.add(f);
         f.setVisible(true);
        
    }//GEN-LAST:event_FurnitureActionPerformed

    private void MyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyCartActionPerformed
        // TODO add your handling code here:;
                /*if(Signin==false)
        {
            JOptionPane.showMessageDialog(this,"You are not signed in!!!!Please sign in first");
            new userlog().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            MyCart cart=new MyCart();
            cart.setVisible(true);
            this.setVisible(false);
        }*/
    }//GEN-LAST:event_MyCartActionPerformed

    private void MobilesAccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobilesAccessoriesActionPerformed
        // TODO add your handling code here:
         MobilesAndAccessories ma=new MobilesAndAccessories(ID,name,Signin);
         jDesktopPane1.add(ma);
         ma.setVisible(true);
    }//GEN-LAST:event_MobilesAccessoriesActionPerformed

    private void HouseholdAndKitchenAppliancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseholdAndKitchenAppliancesActionPerformed
        // TODO add your handling code here:
        HouseholdAndKitchen h=new HouseholdAndKitchen(ID,name,Signin);
        jDesktopPane1.add(h);
        h.setVisible(true);
        
    }//GEN-LAST:event_HouseholdAndKitchenAppliancesActionPerformed

    private void BooksAndStationeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksAndStationeryActionPerformed
        // TODO add your handling code here:
        BooksAndStationery b=new BooksAndStationery(name,Signin,ID);
        jDesktopPane1.add(b);
        b.setVisible(true);
        
    }//GEN-LAST:event_BooksAndStationeryActionPerformed

    private void GroceryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroceryActionPerformed
        // TODO add your handling code here:
        Groceries g=new Groceries(ID,name,Signin);
        jDesktopPane1.add(g);
        g.setVisible(true);
        
    }//GEN-LAST:event_GroceryActionPerformed

    private void DailyEssentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyEssentialsActionPerformed
        // TODO add your handling code here:
        DailyEssentials de=new DailyEssentials(ID,name,Signin);
        jDesktopPane1.add(de);
        de.setVisible(true);
        
    }//GEN-LAST:event_DailyEssentialsActionPerformed

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
        // TODO add your handling code here:
        new EditProfile(ID,name,Signin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EditProfileActionPerformed

    private void GoToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToCartActionPerformed
        // TODO add your handling code here:
        if(Signin==false){
            JOptionPane.showMessageDialog(this,"You have not signed in! Please sign in first");
            new userlogin().setVisible(true);
            this.setVisible(false);
        }
        else{
        try {
                U_ID=Integer.parseInt(ID);
            ps=con.prepareStatement("select * from cart where u_id=?");
            ps.setInt(1,U_ID);
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                this.setVisible(false);
                MyCart cart=new MyCart(ID,name,Signin);
                cart.setVisible(true);
                
            }
            
            else
            {
                JOptionPane.showMessageDialog(this,"Your cart is empty!!");
            }
        }
        
        catch (SQLException ex) {
            Logger.getLogger(MyCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_GoToCartActionPerformed

    private void AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductActionPerformed
        // TODO add your handling code here:
        new EnterCategory(name,Signin).setVisible(true);
        this.setVisible(false);
        //EnterCategory ec = new EnterCategory(name,Signin);
        //ec.setVisible(true);
    }//GEN-LAST:event_AddProductActionPerformed

    private void ViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrderActionPerformed
        // TODO add your handling code here:
        ViewOrders o=new ViewOrders();
        o.setVisible(true);
    }//GEN-LAST:event_ViewOrderActionPerformed

    private void UpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProductActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Select the Category!!");
    }//GEN-LAST:event_UpdateProductActionPerformed

    private void DeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Select the Category!!");
    }//GEN-LAST:event_DeleteProductActionPerformed

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
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userpage("","",true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddProduct;
    private javax.swing.JButton BooksAndStationery;
    private javax.swing.JButton DailyEssentials;
    private javax.swing.JMenuItem DeleteProduct;
    private javax.swing.JMenuItem EditProfile;
    private javax.swing.JButton Furniture;
    private javax.swing.JMenuItem GoToCart;
    private javax.swing.JButton Grocery;
    private javax.swing.JButton HouseholdAndKitchenAppliances;
    private javax.swing.JMenuItem Login;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JButton MobilesAccessories;
    private javax.swing.JMenu More;
    private javax.swing.JMenu MyCart;
    private javax.swing.JMenu Profile;
    private javax.swing.JMenuItem Signup;
    private javax.swing.JMenuItem UpdateProduct;
    private javax.swing.JMenuItem ViewOrder;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
