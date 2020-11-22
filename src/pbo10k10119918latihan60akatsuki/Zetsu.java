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
public class Zetsu extends Akatsuki {
    private String keunikan;
    
    public Zetsu(String nama, String asalDesa, String elemen, String matiOleh, 
            String keunikan) {
        super(nama, asalDesa, elemen, matiOleh);
        this.keunikan = keunikan;
    }
    
    public String getKeunikan() {
        return keunikan;
    }
    
    @Override
    public void tampilKeterangan() {
        System.out.println("Merupakan otak dari akatsuki supaya kebangkitan "
                + "ibunya (Kaguya Ootsutsuki) dengan mengkamuflasekannya "
                + "dengan rencana mata bulan (Mugen Tsukoyomi)");
    }
}
