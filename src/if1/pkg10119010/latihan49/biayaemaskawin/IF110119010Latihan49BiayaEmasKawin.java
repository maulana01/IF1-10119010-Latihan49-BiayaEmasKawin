/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan49.biayaemaskawin;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi cara menghitung biaya emas kawin
 *                     dengan konsep OOP
 */
public class IF110119010Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiayaEmasKawin emasKawin = new BiayaEmasKawin("Hendi");
        
        emasKawin.setEmas(15.7);
        emasKawin.setHarga(570000.0);
        double emas = emasKawin.getEmas();
        double harga = emasKawin.getHarga();
        System.out.println("Jumlah Emas yang akan di beli : " + emas + " gram");
        System.out.println("Harga Emas Per/Gram : Rp. " + harga);
        System.out.println("Total Bayar : Rp. "  + emasKawin.totalBayar(emas, harga));
    }
    
}
