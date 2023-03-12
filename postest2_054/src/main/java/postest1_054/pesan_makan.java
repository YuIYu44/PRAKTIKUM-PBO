/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1_054;

/**
 *
 * @author HP
 */
public class pesan_makan {
    private String nama_makan;
    private int harga_makan;
    public pesan_makan(String nama,int harga){
        this.nama_makan=nama;
        this.harga_makan=harga;}

    public String getNama_makan() {
        return nama_makan;}

    public void setNama_makan(String nama_makan) {
        this.nama_makan = nama_makan;}

    public int getHarga_makan() {
        return harga_makan;}

    public void setHarga_makan(int harga_makan) {
        this.harga_makan = harga_makan;}
}
