/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;
public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(10000000);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(30000000);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}