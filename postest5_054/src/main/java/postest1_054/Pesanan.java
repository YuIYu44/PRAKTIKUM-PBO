/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1_054;

/**
 *
 * @author HP
 */
public abstract class Pesanan {
    protected String nama;
    protected int harga;
    public Pesanan(String namas,int hargas){
        this.nama=namas;
        this.harga=hargas;}
    protected abstract String getnama();
    protected abstract void setnama(String namas);
    protected abstract int getharga();
    protected abstract void setharga(int hargas);
    protected abstract void terpesan();
    protected void terpesan(int total){
        System.out.println("\nAnda telah memesan dengan total:  "+total+"\n");
    }}
