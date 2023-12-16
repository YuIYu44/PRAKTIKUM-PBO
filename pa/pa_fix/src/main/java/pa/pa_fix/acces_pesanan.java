/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.pa_fix;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class acces_pesanan extends koneksi{
   public acces_pesanan(){
    super.koneksi();}
    public void hapus_pesanan(String stuff){
       try {super.stm.executeUpdate("Delete from pesanan where Id_pesanan= "+stuff+"");
    }catch (SQLException sql) {     
       System.out.println(sql);}}
    public void tambah_pesanan(String[] stuff, String name){
       try {
           super.stm.executeUpdate("Insert into pesanan (Nama,Harga,Jenis,Pemesan) values ('"+stuff[0]+"','"+stuff[1]+"','"+stuff[2]+"','"+stuff[3]+"')");
           super.stm.executeUpdate("Update pelanggan set Nama='"+name + "' where kursi=" + stuff[3]);
    }catch (SQLException sql) {     
        System.out.println(sql);}}
    
     public void kursi(JComboBox jcb){
      jcb.removeAllItems();
         try {
         super.stm.executeUpdate("UPDATE  pelanggan LEFT JOIN pesanan ON kursi = pesanan.Pemesan SET pelanggan.Nama = '' WHERE pesanan.Pemesan IS NULL");
         ResultSet rs=super.stm.executeQuery("Select kursi from pelanggan");
         while(rs.next()){
         jcb.addItem(rs.getString("kursi"));}
    }catch (SQLException sql) {     
        System.out.println(sql);}}
     
  public ResultSet acces_riwayat(String items,int kursi){
        try {
            ResultSet results = super.stm.executeQuery("select * from pesanan where Nama= '" + items+ "' and kursi= "+kursi);
           return results;
    }catch (SQLException sql) {     
        System.out.println(sql);}
        return null;}
}
