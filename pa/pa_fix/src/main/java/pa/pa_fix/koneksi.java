package pa.pa_fix;

import java.sql.*;
 
public abstract class koneksi{
    protected Statement stm;
    protected Connection con;
    public final void koneksi(){
        try {
            String url ="jdbc:mysql://localhost/vynresto";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm =con.createStatement();        
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }    
}