package ecommerce;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///ecommerce","root","anjum2000");
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String [] args){
        
    }
}
