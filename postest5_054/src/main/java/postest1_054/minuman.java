/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1_054;

/**
 *
 * @author HP
 */
public final class minuman extends Pesanan {
    private String Jenis;
    minuman(String namas,int hargas,String jenis){
        super(namas,hargas);
        this.Jenis=jenis;
    }
     public String getnama() {
        return nama;}

    public void setnama(String namas) {
        this.nama = namas;}

    public int getharga() {
        return harga;}

    public void setharga(int hargas) {
        this.harga = hargas;}
    public String getJenis() {
        return Jenis;}
    
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    public void terpesan(){
        System.out.println("Minuman "+this.Jenis+" "+getnama()+" Terpesan");}
}
