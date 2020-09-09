/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_JS2;
public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int jumlah;
       
    public void tampilData(){
        System.out.println("ID: " +id);
        System.out.println("nama member: " + namaMember);
        System.out.println("nama game: " + namaGame);
        System.out.println("jumlah sewa: " + jumlah);  
        
    }
    public int hargaSewa(int hrgSewa){
        int harga = hrgSewa * jumlah;
        return harga;
    }
}