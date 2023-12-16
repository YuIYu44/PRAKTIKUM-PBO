/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.pa_fix;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class acces_akun extends koneksi { 
    acces_akun(){};
   acces_akun(String Username,String Password,JFrame frame){
    super.koneksi();
    try {
        String queryString = String.join("","SELECT * FROM admin where Username= '",Username, "' and Password= '",Password,"'");
        ResultSet results = super.stm.executeQuery(queryString);
        if(!results.next()) {
            JOptionPane.showMessageDialog(new JFrame(),"Username/Password Anda Salah","Login",  JOptionPane.WARNING_MESSAGE);
        }
        else{
           new Manajemen().setVisible(true);
           frame.dispose();
           results.close();
        }
        super.con.close();
    } catch (SQLException sql) {
        System.out.println(sql);
    }}
   public int acces_akun(String Username,int kursi){
    super.koneksi();
    try {
        String queryString = "SELECT * FROM pelanggan where Nama= '"+Username.toUpperCase()+"' and kursi= "+kursi;
        ResultSet results = super.stm.executeQuery(queryString);
        if(!results.next()) {
         queryString = "SELECT * FROM pelanggan where Nama= '' and kursi= "+kursi;
         results = super.stm.executeQuery(queryString);
         if(!results.next()) {
            JOptionPane.showMessageDialog(new JFrame(),"Kursi Telah Dipesan Bukan Oleh Anda","Login",  JOptionPane.INFORMATION_MESSAGE);
            return 0;
         }
         else{
             return 1;
         }}
        else{
            results.close();
        super.con.close();
                   return 2;
        }
    } catch (SQLException sql) {
        System.out.println(sql);
        return -1;
    }}}
