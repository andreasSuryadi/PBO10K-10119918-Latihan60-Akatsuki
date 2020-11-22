/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan60akatsuki;

/**
 *
 * @author andreas
 */
public class Tobi extends Akatsuki {
    private String kekuatanMata;
    
    public Tobi(String nama, String asalDesa, String elemen, String matiOleh, 
            String kekuatanMata) {
        super(nama, asalDesa, elemen, matiOleh);
        this.kekuatanMata = kekuatanMata;
    }
    
    public String getKekuatanMata() {
        return kekuatanMata;
    }
    
    @Override
    public void tampilKeterangan() {
        System.out.println("Dia adalah Obito Uchiha yang menyamar sebagai Tobi \n"
                + "sekaligus menggunakan nama Madara Uchiha sampai rencana \n"
                + "mata bulan tercapai");
    }
}
