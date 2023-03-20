/*
 * Click nbfs:e-default.txt to change this license
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
    
    static void menu1(ArrayList<pesan_makan> menu){ 
    System.out.println("\nMENU");
    for(int i=0;i<6;i++){
            System.out.println((i+1)+". "+menu.get(i).getNama_makan()+"    "+menu.get(i).getHarga_makan());}
    }
    
    public static void main(String[] args) throws IOException{
        ArrayList<pesan_makan> menus=new ArrayList<>();
        String[] menu={"Salad Special Ayam Grilled","Steak dengan Nasi","Honey Mustard Ayam Smoked","Strawberry Punch","Matcha Frappe","Tea Lychee"};
        int[] harga={42500,60000,45000,14000,22000,8000};
        for (int j = 0; j < 6; j++) {
            pesan_makan inputs=new pesan_makan(menu[j],harga[j]);
            menus.add(inputs);}
        ArrayList<pesan_makan> pesan=new ArrayList<>();
        int indeks_menu=1;
        int x=0;
        while(indeks_menu!=5){
            System.out.println("\n1.Lihat Pesanan\n2.Pesan\n3.Ubah Pesanan\n4.Hapus Pesanan\n5.Exit");
            System.out.print("Masukkan Pilihan:");
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bfr=new BufferedReader(isr);
            indeks_menu=Integer.parseInt(bfr.readLine());
            switch(indeks_menu){
                case 1:
                    if (pesan.isEmpty()){
                        System.out.println("Pesanan Kosong");}
                    else{
                        System.out.println("\nPesanan Anda");
                        for(int i=0;i<x;i++){
                            System.out.println((i+1)+". "+pesan.get(i).getNama_makan() +"   "+pesan.get(i).getHarga_makan());}}
                    break;
                case 2:
                    menu1(menus);
                    System.out.print("Pesan pada nomor: ");
                    int indeks_tambah=Integer.parseInt(bfr.readLine());
                    pesan_makan tambah=new pesan_makan(menus.get(indeks_tambah-1).getNama_makan(),menus.get(indeks_tambah-1).getHarga_makan());
                    pesan.add(tambah);
                    x += 1;
                    break;
                case 3:
                    if (pesan.isEmpty()){
                        System.out.println("Pesanan Anda Kosong");}
                    else{
                        System.out.print("Ganti nomor:");
                        int idx=Integer.parseInt(bfr.readLine());
                        menu1(menus);
                        System.out.print("Ganti Menjadi");
                        int indeks_ubah=Integer.parseInt(bfr.readLine());
                        pesan_makan ubah=new pesan_makan(menus.get(indeks_ubah-1).getNama_makan(),menus.get(indeks_ubah-1).getHarga_makan());
                        pesan.set(idx-1,ubah);}
                    break;
                case 4:
                    if (pesan.isEmpty()){
                        System.out.println("Pesanan Anda Kosong");}
                    else{
                        System.out.print("Hapus nomor:");
                        int idx=Integer.parseInt(bfr.readLine());
                        x-=1;
                        pesan.remove(idx-1);}
                    break;
                case 5:
                    indeks_menu=5;
                    break;
                default :System.out.println("masukkan error");
        }}}}

