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
public class Akatsuki {
    private String nama, asalDesa, elemen, matiOleh;
    
    public Akatsuki(String nama, String asalDesa, String elemen, String matiOleh) {
        this.nama = nama;
        this.asalDesa = asalDesa;
        this.elemen = elemen;
        this.matiOleh = matiOleh;
   }

    public String getNama() {
        return nama;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public String getElemen() {
        return elemen;
    }

    public String getMatiOleh() {
        return matiOleh;
    }
    
    public void tampilKeterangan() {
        System.out.println("Keterangan Akatsuki");
    }
}
