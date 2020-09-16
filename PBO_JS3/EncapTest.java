/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        
        encap.setNama("James");
        encap.setAge(10);
        
        System.out.println("nama : " + encap.getNama());
        System.out.println("Age : " + encap.getAge());
    }
    
}
