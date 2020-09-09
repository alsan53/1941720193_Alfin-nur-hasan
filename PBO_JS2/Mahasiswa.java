/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_JS2;
public class Mahasiswa {
       public int nim;
       public String nama;
       public String alamat;
       public String kelas;
       public String tingkat;
       public String mataKuliah;
       
       public void tampilBiodata(){
           System.out.println("nama: " + nama);
           System.out.println("kelas: " + kelas);
           System.out.println("alamat: " + alamat);
           System.out.println("nim: " + nim);
           System.out.println("tingkat: " + tingkat);
           System.out.println("Matakuliah: " + mataKuliah);
           
    }
}