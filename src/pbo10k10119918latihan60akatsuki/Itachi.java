package pbo10k10119918latihan60akatsuki;

/**
 *
 * @author andreas
 */
public class Itachi extends Akatsuki {
    private String kekuatanMata;
    
    public Itachi(String nama, String asalDesa, String elemen, String matiOleh, 
            String kekuatanMata) {
        super(nama, asalDesa, elemen, matiOleh);
        this.kekuatanMata = kekuatanMata;
    }

    public String getKekuatanMata() {
        return kekuatanMata;
    }
    
    @Override
    public void tampilKeterangan() {
        System.out.println("Membunuh semua klan uchiha kecuali adiknya Uchiha \n"
                + "Sasuke. Dia merupakan karakter jahat yang sebenarnya baik \n"
                + "demi melindungi desanya");
    }
}
