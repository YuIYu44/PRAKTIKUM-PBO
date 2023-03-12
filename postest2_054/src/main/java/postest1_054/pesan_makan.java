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
    String nama_makan;//attribute dari pesanan
    int harga_makan;
    int x;
    ArrayList<ArrayList<Object>> pesanan=new ArrayList<>(1);
    public pesan_makan(Object nama,Object harga,Object pesan,int x){
        this.nama_makan=nama.toString();//mengubah dari object menjadi data type yang diinginkan
        this.harga_makan=(int) harga;
        this.x=x;
        this.pesanan=(ArrayList<ArrayList<Object>>)pesan;//mendeklariskan pesanan dari array 2D
    }
    public ArrayList<ArrayList<Object>> adds(){//method penambahan
        pesanan.add(new ArrayList<Object>(2));//mendeklarasikan masing2 array terdiri dari 2 objek
        pesanan.get(x).add(nama_makan);//menambahkan nama dan harga pada array pesanan.
        pesanan.get(x).add(harga_makan);
        return pesanan;//mengembalikan arraylist pesanan
    }
    public ArrayList<ArrayList<Object>> change(){//method perubahan
        pesanan.get(x).set(0,nama_makan);//mengubah nama dan harga sesuai indeks
        pesanan.get(x).set(1,harga_makan);
        return pesanan;
    }
}
