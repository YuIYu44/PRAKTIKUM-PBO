/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.pa_fix;

/**
 *
 * @author HP
 */
public class pesanan_sementara {
    private String nama;
    private String harga;
    private String jenis;
    pesanan_sementara(String namas,String hargas,String jenis_){
        this.nama=namas;
        this.jenis=jenis_;
        this.harga=hargas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
