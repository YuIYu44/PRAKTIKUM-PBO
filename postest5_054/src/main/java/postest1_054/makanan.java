/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1_054;

/**
 *
 * @author HP
 */
public class makanan extends Pesanan {
    private String Jenis;
    makanan(String namas,int hargas,String jenis){
        super(namas,hargas);
        this.Jenis=jenis;
    }

    /**
     * @return the Jenis
     */
    public String getJenis() {
        return Jenis;
    }

    /**
     * @param Jenis the Jenis to set
     */
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    @Override
    public void terpesan(){
        System.out.println("Makanan "+this.Jenis+" "+super.getnama()+" Terpesan");
    }
}