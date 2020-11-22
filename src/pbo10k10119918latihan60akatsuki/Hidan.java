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
public class Hidan extends Akatsuki {
    private String aliran;
    
    public Hidan(String nama, String asalDesa, String elemen, String matiOleh, 
            String aliran) {
        super(nama, asalDesa, elemen, matiOleh);
        this.aliran = aliran;
    }

    public String getAliran() {
        return aliran;
    }
    
    @Override
    public void tampilKeterangan() {
        System.out.println("Merupakan penganut aliran jashin dan telah membunuh \n"
                + "salah satu karakter bernama Asuma Sarutobi. Dia mati oleh \n"
                + "Shikamaru Nara yang menguburnya hidup-hidup");
    }
}
