/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotorEncapsulation;
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin (){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true){
            kecepatan += 100;
        }
        else{
            System.out.println("kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true){
            kecepatan+= 100;
        }
        else{
            System.out.println("kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("kontak on");
        }
        else{
            System.out.println("kontak off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}