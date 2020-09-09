/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_JS2;
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
       
    public void tampilBarang(){
        System.out.println("nama barang: " + namaBrg);
        System.out.println("jenis barang: " + jenisBrg);
        System.out.println("jumlah stok: " + stok);
    }   
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;  
    }
}