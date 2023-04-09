/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1_054;

/**
 *
 * @author HP
 */
public final class makanan extends Pesanan implements Jenis{
    private String Jenis;
    makanan(String namas,int hargas,String jenis){
        super(namas,hargas);
        this.Jenis=jenis;
    }
    @Override
     public String getnama() {
        return nama;}

    @Override
    public void setnama(String namas) {
        this.nama = namas;}

    @Override
    public int getharga() {
        return harga;}

    @Override
    public void setharga(int hargas) {
        this.harga = hargas;}
    @Override
    public String getJenis() {
        return Jenis;}
    
    @Override
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    @Override
    public void terpesan(){
        System.out.println("Makanan "+this.Jenis+" "+getnama()+" Terpesan");}
}