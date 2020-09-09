/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_JS2;
public class TestMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa mhs1=new Mahasiswa();
        
        mhs1.nama = ("alfin");
        mhs1.kelas = ("TI 2B");
        mhs1.alamat = ("blitar");
        mhs1.nim = 123;
        mhs1.tingkat = ("2");
        mhs1.mataKuliah = ("PBO");
        mhs1.tampilBiodata();
    }   
}