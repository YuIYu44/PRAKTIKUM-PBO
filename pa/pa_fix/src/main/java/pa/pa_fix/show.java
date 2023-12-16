/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.pa_fix;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public final class  show extends javax.swing.JFrame{
    show(){}
    show(JTable table,String items){
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        ResultSet rs=new acces_menu().acces_menu(items) ;   
        DefaultTableModel tbmodel=(DefaultTableModel) table.getModel();
        try {
            while(rs.next()){
               ArrayList<String> db = new ArrayList<String>();
                for(int col=0;col<tbmodel.getColumnCount();col++){
                db.add(rs.getString(tbmodel.getColumnName(col)));}
                tbmodel.addRow(db.toArray());
            }
                rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Manajemen.class.getName()).log(Level.SEVERE, null, ex);
        }} 

    show(JTable table,ArrayList<pesanan_sementara> list){
                DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                dtm.setRowCount(0);
            for(int row=0;row<list.size();row++){
                String[] db={list.get(row).getNama(),list.get(row).getHarga(),list.get(row).getJenis()};
                dtm.addRow(db);}
            }
    public void show_icon(String Dir,JLabel labels){
    String userDirectory = System.getProperty("user.dir")+"\\icon\\"+Dir;
    labels.setIcon(new ImageIcon(userDirectory));
    }
}