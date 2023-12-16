/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.pa_fix;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class acces_menu extends koneksi {
   private ResultSet rs;
   private String kind;
   public acces_menu(){
    super.koneksi();}
   
    public ResultSet acces_menu(String items){
        try {rs=super.stm.executeQuery("select * from " + items);
           return rs;
    }catch (SQLException sql) {     
        System.out.println(sql);}
        return null;}
    
   public void edit_menu(String[] stuff){
       try {
          if(stuff[2]=="ES"||stuff[2]=="PANAS"){
           kind="minuman";
           super.stm.executeUpdate("Update minuman set Harga= '"+stuff[1]+"',Jenis='"+stuff[2]+"' where Nama='"+stuff[0]+"'");}
           else{
           kind="makanan";
            super.stm.executeUpdate("Update makanan set Harga= '"+stuff[1]+"',Jenis='"+stuff[2]+"' where Nama='"+stuff[0]+"'");}
    }catch (SQLException sql) {     
        System.out.println(sql);}}
   
    public void tambah_menu(String[] stuff){
       try {
           if(stuff[2]=="ES"||stuff[2]=="PANAS"){
           kind="minuman";
           super.stm.executeUpdate("Insert into minuman (Nama,Harga,Jenis) values ('"+stuff[0]+"','"+stuff[1]+"','"+stuff[2]+"')");}
           else{
           kind="makanan";
           super.stm.executeUpdate("Insert into makanan (Nama,Harga,Jenis) values ('"+stuff[0]+"','"+stuff[1]+"','"+stuff[2]+"')");}
    }catch (SQLException sql) {     
        JOptionPane.showMessageDialog(new JFrame(), "Nama Makanan/Minuman Telah Digunakan", "ERROR INPUT", JOptionPane.WARNING_MESSAGE);}}
    
     public void hapus_menu(String[] stuff){
               try {
        if(stuff[1]=="ES"||stuff[1]=="PANAS"){
           kind="minuman";
           super.stm.executeUpdate("Delete from minuman where Nama= '"+stuff[0]+"'");}
        else{
           kind="makanan";
             super.stm.executeUpdate("Delete from makanan where Nama= '"+stuff[0]+"'");}
    }catch (SQLException sql) {     
        System.out.println(sql);}}

    public String getKind() {
        return kind;
    }
    
    public void setKind(String kind) {
        this.kind = kind;
    }
     
}


