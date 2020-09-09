/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_JS2;
public class TestPeminjaman {
    public static void main(String[] args) {
            
        Peminjaman pjm1 = new Peminjaman();
        
        pjm1.id = 12;
        pjm1.namaMember = "Alfin";
        pjm1.namaGame = "dota";
        pjm1.hari = 2;
        pjm1.tampilData();
        
        System.out.println("harganya : " + pjm1.hargaSewa(20000));
    }
    
}