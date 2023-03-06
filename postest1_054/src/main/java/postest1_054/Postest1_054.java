/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package postest1_054;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Postest1_054 {
    static ArrayList<ArrayList<Object>> menu1(){ //menu dari admin yang tersedia dan tidak bisa di crud
    ArrayList<ArrayList<Object>> menu_menu = new ArrayList<>(1);//menu_menu merupakan 2d array dari 2 array satu dimensi yang disusun
    String[] menu={"Salad Special Ayam Grilled","Steak dengan Nasi","Honey Mustard Ayam Smoked"
    ,"Strawberry Punch","Matcha Frappe","Tea Lychee"};
    int[] harga={42500,60000,45000,14000,22000,8000};
    for (int j = 0; j < 6; j++) {
            menu_menu.add(new ArrayList<Object>(2));}// Akan terdapat 2 object didalam masing-masing array
    for(int indeks_menu=0;indeks_menu<6;indeks_menu++){//mengisi array menu_menu dari array menu dan harga
       menu_menu.get(indeks_menu).add(0,menu[indeks_menu]);
       menu_menu.get(indeks_menu).add(1,harga[indeks_menu]);}
    System.out.println("\nMENU");
    for(int i=0;i<6;i++){//mengeprint menu_menu
            System.out.println((i+1)+". "+menu_menu.get(i).get(0)+"    "+menu_menu.get(i).get(1));}
    return menu_menu;}//return dalam bentuk array 2D
    
    public static void main(String[] args) throws IOException{
        ArrayList<ArrayList<Object>> pesan=new ArrayList<>(1);//membuat array baru untuk makanan yang dipesan
        pesan.add(new ArrayList<Object>());
        int indeks_menu=1;//mendeklarasikan indeks_menu untuk loop
        ArrayList<ArrayList<Object>> menu_menu = menu1();//mendeklarasikan menu_menu hasil return dari method menu1()
        int x=0;//deklarasi x sebagai jumlah_pesanan
        while(indeks_menu!=5){//loop dalam program
            System.out.println("\n1.Lihat Pesanan\n2.Pesan\n3.Ubah Pesanan\n4.Hapus Pesanan\n5.exit");
            System.out.println("Masukkan Pilihan:");
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bfr=new BufferedReader(isr);
            indeks_menu=Integer.parseInt(bfr.readLine());//menginput pilihan program yang ingin dijalankan
            switch(indeks_menu){
                case 1:
                    System.out.println("\nPesanan Anda");
                    for(int i=0;i<x;i++){
                        System.out.println((i+1)+". "+pesan.get(i).get(0)+"   "+pesan.get(i).get(1));}//mengeprint pesanan
                    break;
                case 2:
                    menu1();
                    System.out.println("Pesan pada nomor: ");
                    int indeks_tambah=Integer.parseInt(bfr.readLine());//inputan yang ingin dipesan dari menu
                    pesan_makan tambah=new pesan_makan(menu_menu.get(indeks_tambah-1).get(0),menu_menu.get(indeks_tambah-1).get(1),pesan,x);//mengakses class pesan_makan
                    //parameter 1 untuk nama makanan pada menu, parameter 2 untuk harga makanan pada menu, parameter 3 arraylist pesanan yang ingin ditambahkan, parameter 4 sebagai indeks terakhir dari arraylist
                    pesan=tambah.adds();//mengubah arraylist pesan menjadi hasil return dari tambah pada class pesan_makan bagian method adds.
                    x += 1;
                    break;
                case 3:
                    System.out.println("Ganti nomor:");
                    int idx=Integer.parseInt(bfr.readLine());//indeks nomor dari pesanan yang ingin diganti
                    menu1();
                    System.out.println("Ganti Menjadi");
                    int indeks_ubah=Integer.parseInt(bfr.readLine());//inputan pengganti dari menu
                    pesan_makan ubah=new pesan_makan(menu_menu.get(indeks_ubah-1).get(0),menu_menu.get(indeks_ubah-1).get(1),pesan,idx-1);//parameter 4 sebagai index yang ingin diubah dari pesanan
                    pesan=ubah.change();//mengubah arraylist pesan menjadi hasil return dari tambah pada class pesan_makan bagian method change.
                    break;
                case 4:
                    System.out.println("Hapus nomor:");
                    idx=Integer.parseInt(bfr.readLine());//indeks nomor dari pesanan yang ingin dihapus
                    x-=1;
                    pesan.remove(idx-1);//menghapus arraylist sesuai indeks nomor
                    break;
                case 5:
                    indeks_menu=5;//mengubah indeks_menjadi 5 sehingga tidak sesuai dengan syarat loop dan keluar dari program.
                    break;
                default :System.out.println("masukkan error");//seandainya masukan tidak sesuai
        }}}}

