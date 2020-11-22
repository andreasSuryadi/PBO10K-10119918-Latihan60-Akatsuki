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
public class Kakuzu extends Akatsuki {
    private String keunikan;
    
    public Kakuzu(String nama, String asalDesa, String elemen, String matiOleh, 
            String keunikan) {
        super(nama, asalDesa, elemen, matiOleh);
        this.keunikan = keunikan;
    }

    public String getKeunikan() {
        return keunikan;
    }
    
    @Override
    public void tampilKeterangan() {
        System.out.println("Mempunyai 5 jantung dan menguasai 5 elemen dasar \n"
                + ", dia merupakan karakter di akatsuki yang paling suka dengan \n"
                + "uang. Dia mati oleh Naruto Uzumaki dengan jutsu Rasen Shuriken.");
    }
}
