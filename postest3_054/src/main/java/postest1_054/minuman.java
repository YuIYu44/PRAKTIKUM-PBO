/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1_054;

/**
 *
 * @author HP
 */
public class minuman extends Pesanan {
    private String Jenis;
    minuman(String namas,int hargas,String jenis){
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
    public void terpesan(){
        System.out.println("Minuman "+this.Jenis+" "+super.getnama()+" Terpesan");
    }
}
