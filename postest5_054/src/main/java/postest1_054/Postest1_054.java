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
    static void menu_show(ArrayList<makanan> mkn,ArrayList<minuman> mnm,String type){ 
        System.out.println("\nMENU");
        if("all".equals(type)||"food".equals(type)){
            System.out.println("A.Makanan");
            for (int i=0;i<mkn.size();i++) {
                System.out.println((i+1)+". ["+mkn.get(i).getJenis()+"] "+mkn.get(i).getnama()+"    "+mkn.get(i).getharga());}}
        if("all".equals(type)||"drink".equals(type)){
            System.out.println("B.Minuman");
            for (int i=0;i<mnm.size();i++) {
                System.out.println((i+1)+". ["+mnm.get(i).getJenis()+"] "+mnm.get(i).getnama()+"    "+mnm.get(i).getharga());}}}
    
    static final void empty() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);
        System.out.println("Pesanan Kosong");
        final String kosong=bfr.readLine();}
    
    static String question(String quest) throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);
        System.out.print(quest);
        String option = bfr.readLine();
        return option;}
    
    static int question2(String quest)throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);
        System.out.print(quest);
        int index =Integer.parseInt(bfr.readLine())-1;
        return index;}
    
    public static void main(String[] args) throws IOException{
        ArrayList<minuman> minuman_menu=new ArrayList<>();
        ArrayList<makanan> makanan_menu=new ArrayList<>();
        final String[] menu_berat={"Salad Special Ayam Grilled","Steak dengan Nasi","Honey Mustard Ayam Smoked","Beef Satay Honey Sauce","Sweet Sheep Steak"};
        final String[] menu_ringan={"Kentang Goreng","Onion Ring","Banana Chips","Fries Chips"};
        final String[] minuman_panas={"Hot Strawberry Milk Punch","Hot Matcha","Hot Tea","Hot Blueberry Milk Punch"};
        final String[] minuman_dingin={"Strawberry Punch","Matcha Frappe","Tea Lychee","Blueberry Punch"};
        final int[] harga_menu_berat={42500,60000,45000,25000,56000};
        final int[] harga_menu_ringan={20000,22000,15000,17000};
        final int[] harga_menu1={17000,20000,16000,18000};
        for (int j = 0; j < menu_berat.length; j++) {
            makanan input=new makanan(menu_berat[j],harga_menu_berat[j],"berat");
            makanan_menu.add(input);}
        for (int j = 0; j < menu_ringan.length; j++) {
            makanan input=new makanan(menu_ringan[j],harga_menu_ringan[j],"ringan");
            makanan_menu.add(input);}
        for (int j = 0; j < minuman_dingin.length; j++) {
            minuman input=new minuman(minuman_dingin[j],harga_menu1[j],"dingin");
            minuman_menu.add(input);}
        for (int j = 0; j < minuman_panas.length; j++) {
            minuman input=new minuman(minuman_panas[j],harga_menu1[j],"panas");
            minuman_menu.add(input);}
        ArrayList<makanan> makanan_pesan = new ArrayList<makanan>();
        ArrayList<minuman> minuman_pesan = new ArrayList<minuman>();
        int indeks_menu=1;
        while(indeks_menu!=5){
            System.out.println("\n1.Lihat Pesanan\n2.Pesan\n3.Ubah Pesanan\n4.Hapus Pesanan\n5.Exit");
            System.out.print("Masukkan Pilihan: ");
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bfr=new BufferedReader(isr);
            indeks_menu=Integer.parseInt(bfr.readLine());
            switch(indeks_menu){
                case 1 -> {
                    if (minuman_pesan.isEmpty()&&makanan_pesan.isEmpty()){
                        empty();}
                    else{
                        System.out.println("\nPesanan Anda");
                        int total=0;
                        if(!makanan_pesan.isEmpty()){
                            System.out.println("A.Makanan");
                            for(int i=0;i<makanan_pesan.size();i++){
                                System.out.println((i+1)+". ["+makanan_pesan.get(i).getJenis()+"] "+makanan_pesan.get(i).getnama() +"   "+makanan_pesan.get(i).getharga());
                                total+=makanan_pesan.get(i).getharga();}}
                        if(!minuman_pesan.isEmpty()){
                            System.out.println("B.Minuman");
                            for(int i=0;i<minuman_pesan.size();i++){
                                System.out.println((i+1)+". ["+minuman_pesan.get(i).getJenis()+"] "+minuman_pesan.get(i).getnama() +"   "+minuman_pesan.get(i).getharga());
                                total+=minuman_pesan.get(i).getharga();}}
                        makanan_pesan.get(0).terpesan(total);}}
               
                case 2 -> {
                    menu_show(makanan_menu,minuman_menu,"all");
                    String option = question("Pesan pada kategori (A/B): ");
                    int index=question2("Pada Nomor: ");
                    if("a".equals(option)||"A".equals(option)){
                        makanan tambah=new makanan(makanan_menu.get(index).getnama(),makanan_menu.get(index).getharga(),makanan_menu.get(index).getJenis());
                        makanan_pesan.add(tambah);
                        makanan_menu.get(index).terpesan();}
                    else if ("B".equals(option)||"b".equals(option)){
                        minuman tambah=new minuman(minuman_menu.get(index).getnama(),minuman_menu.get(index).getharga(),minuman_menu.get(index).getJenis());
                        minuman_pesan.add(tambah);
                        minuman_menu.get(index).terpesan();}}
                
                case 3 -> {
                    String option;
                    if (minuman_pesan.isEmpty()&&makanan_pesan.isEmpty()){
                        empty();}
                    else{
                        option = question("Ganti Pesanan pada kategori (A/B): ");
                        int index=question2("Pada Nomor: ");
                        if(("a".equals(option)||"A".equals(option))&&(!makanan_pesan.isEmpty())){
                            menu_show(makanan_menu,minuman_menu,"food");
                            int idx=question2("Ganti Menjadi Nomor: ");
                            makanan ubah=new makanan(makanan_menu.get(idx).getnama(),makanan_menu.get(idx).getharga(),makanan_menu.get(idx).getJenis());
                            makanan_pesan.set(index,ubah);
                            makanan_menu.get(idx).terpesan();}
                        else if (("b".equals(option)||"B".equals(option))&&(!minuman_pesan.isEmpty())){
                            menu_show(makanan_menu,minuman_menu,"drink");
                            int idx=question2("Ganti Menjadi Nomor: ");
                            minuman ubah=new minuman(minuman_menu.get(idx).getnama(),minuman_menu.get(idx).getharga(),minuman_menu.get(idx).getJenis());
                            minuman_pesan.set(index,ubah);
                            minuman_menu.get(idx).terpesan();}}}
                
                case 4 -> {
                    int index;
                    String option;
                    if (minuman_pesan.isEmpty()&&makanan_pesan.isEmpty()){
                        empty();}
                    else{
                        option = question("Hapus pada kategori (A/B): ");
                        index=question2("Pada Nomor: ");
                        if(("a".equals(option)||"A".equals(option))&&(!makanan_pesan.isEmpty())){
                            makanan_pesan.remove(index);}
                        else if (("b".equals(option)||"B".equals(option))&&(!minuman_pesan.isEmpty())){
                            minuman_pesan.remove(index);}}}
                
                case 5 -> indeks_menu=5;
                
                default -> System.out.println("masukkan error");}
        }}}