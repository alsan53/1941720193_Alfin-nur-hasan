/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;
public class EncapDemo {
    private String nama;
    private int age;
    
    public String getNama(){
        return nama;
    }
    public void setNama (String newNama){
        nama = newNama;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge > 30){
            age = 30;
        }if (newAge < 18){
            age = 18;
        }else{
            age = newAge;
        }
    }    
}