/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan60akatsuki;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data dari 
 * akatsuki yang berasal dari anime naruto
 * 
 */

public class PBO10K10119918Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Itachi itachi = new Itachi("Itachi Uchiha", "Konohagakure", "Api"
                , "Uchiha Sasuke", "Izanami");
        System.out.println("Nama \t\t : " + itachi.getNama());
        System.out.println("Asal Desa \t : " + itachi.getAsalDesa());
        System.out.println("Elemen \t\t : " + itachi.getElemen());
        System.out.println("Mati Oleh \t : " + itachi.getMatiOleh());
        System.out.println("Kekuatan Mata \t : " + itachi.getKekuatanMata());
        System.out.println("Keterangan \t : ");
        itachi.tampilKeterangan();
        
        System.out.println();
        
        Kisame kisame = new Kisame("Kisame", "Kirigakure", "Air"
                , "Bunuh diri", "Samehada");
        System.out.println("Nama \t\t : " + kisame.getNama());
        System.out.println("Asal Desa \t : " + kisame.getAsalDesa());
        System.out.println("Elemen \t\t : " + kisame.getElemen());
        System.out.println("Mati Oleh \t : " + kisame.getMatiOleh());
        System.out.println("Nama Pedang \t : " + kisame.getNamaPedang());
        System.out.println("Keterangan \t : ");
        kisame.tampilKeterangan();
        
        System.out.println();
        
        Hidan hidan = new Hidan("Hidan", "Yugakure", "-"
                , "Shikamaru Nara", "Jashin");
        System.out.println("Nama \t\t : " + hidan.getNama());
        System.out.println("Asal Desa \t : " + hidan.getAsalDesa());
        System.out.println("Elemen \t\t : " + hidan.getElemen());
        System.out.println("Mati Oleh \t : " + hidan.getMatiOleh());
        System.out.println("Aliran \t\t : " + hidan.getAliran());
        System.out.println("Keterangan \t : ");
        hidan.tampilKeterangan();
        
        System.out.println();
        
        Kakuzu kakuzu = new Kakuzu("Kakuzu", "Takigakure", "5 elemen dasar"
                , "Naruto Uzumaki", "Cinta Uang");
        System.out.println("Nama \t\t : " + kakuzu.getNama());
        System.out.println("Asal Desa \t : " + kakuzu.getAsalDesa());
        System.out.println("Elemen \t\t : " + kakuzu.getElemen());
        System.out.println("Mati Oleh \t : " + kakuzu.getMatiOleh());
        System.out.println("Keunikan \t : " + kakuzu.getKeunikan());
        System.out.println("Keterangan \t : ");
        kakuzu.tampilKeterangan();
        
        System.out.println();
        
        Zetsu zetsu = new Zetsu("Zetsu", "-", "-"
                , "Naruto Uzumaki", "Dalang dibalik kerusuhan akatsuki");
        System.out.println("Nama \t\t : " + zetsu.getNama());
        System.out.println("Asal Desa \t : " + zetsu.getAsalDesa());
        System.out.println("Elemen \t\t : " + zetsu.getElemen());
        System.out.println("Mati Oleh \t : " + zetsu.getMatiOleh());
        System.out.println("Keunikan \t : " + zetsu.getKeunikan());
        System.out.println("Keterangan \t : ");
        zetsu.tampilKeterangan();
        
        System.out.println();
        
        Tobi tobi = new Tobi("Tobi", "Konohagakure", "Api"
                , "-", "Kamui");
        System.out.println("Nama \t\t : " + tobi.getNama());
        System.out.println("Asal Desa \t : " + tobi.getAsalDesa());
        System.out.println("Elemen \t\t : " + tobi.getElemen());
        System.out.println("Mati Oleh \t : " + tobi.getMatiOleh());
        System.out.println("Kekuatan Mata \t : " + tobi.getKekuatanMata());
        System.out.println("Keterangan \t : ");
        tobi.tampilKeterangan();
    }
    
}
