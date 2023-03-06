/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1_054;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
public class pesan_makan {
    String nama_makan;
    int harga_makan;
    int x;
    ArrayList<ArrayList<Object>> pesanan=new ArrayList<>(1);
    public pesan_makan(Object nama,Object harga,Object pesan,int x){
        this.nama_makan=nama.toString();
        this.harga_makan=(int) harga;
        this.x=x;
        this.pesanan=(ArrayList<ArrayList<Object>>)pesan;}
    public ArrayList<ArrayList<Object>> adds(){
        pesanan.add(new ArrayList<Object>(2));
        pesanan.get(x).add(nama_makan);
        pesanan.get(x).add(harga_makan);
        return pesanan;
    }
    public ArrayList<ArrayList<Object>> change(){
        pesanan.get(x).set(0,nama_makan);
        pesanan.get(x).set(1,harga_makan);
        return pesanan;
    }
}
