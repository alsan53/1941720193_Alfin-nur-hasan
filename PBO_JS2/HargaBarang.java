/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_JS2;
public class HargaBarang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
       
    public void tampilHargaBarang(){
        System.out.println("kode barang: " + kode);
        System.out.println("nama barang: " + namaBarang);
        System.out.println("jenis barang: Rp " + hargaDasar);
        System.out.println("jumlah stok: " + diskon);
    }
}