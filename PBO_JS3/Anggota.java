/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;
public class Anggota {
    private String nama;
    private String nomor;
    private float simpanan;
    private float pinjaman;
    private float jumlahPinjaman;
    private float limitPinjaman;
    
    Anggota(String nomor, String nama,int limitPinjaman){
        this.nama = nama;
        this.nomor = nomor;
        this.simpanan = 0;
        this.limitPinjaman = limitPinjaman;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    public String getNama(){
        return nama;
    }
    public String getNomor(){
        return nomor;
    }
    public float getLimitPinjaman(){
        if(pinjaman > 5000000){
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        }
        return limitPinjaman;
    }
    public float getJumlahPinjaman(){
        return simpanan;
    }
    public void pinjam(float uang){
        simpanan += uang;
    }
    public void angsur(float uang){
        simpanan -= uang;
    }
}