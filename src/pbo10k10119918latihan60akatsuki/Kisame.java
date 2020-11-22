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
public class Kisame extends Akatsuki {
    private String namaPedang;
    
    public Kisame(String nama, String asalDesa, String elemen, String matiOleh, 
            String namaPedang) {
        super(nama, asalDesa, elemen, matiOleh);
        this.namaPedang = namaPedang;
    }

    public String getNamaPedang() {
        return namaPedang;
    }
    
    @Override
    public void tampilKeterangan() {
        System.out.println("Memegang pedang samehada dengan cara membunuh \n"
                + "pemilik pedang Fubuki yang merupakan gurunya untuk mengambil \n"
                + " pedangnya");
    }
}
