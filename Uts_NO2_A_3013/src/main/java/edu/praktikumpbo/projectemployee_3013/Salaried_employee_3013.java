/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectemployee_3013;

/**
 *
 * @author ASUS
 * Nama : Fathia Ismi Rahma
 * NIM  : 21103013
 */
public class Salaried_employee_3013 extends Employee_3013{
    private int upahMingguan;
    int gaji;
    
    public Salaried_employee_3013(String nama, String nip, int upahMingguan){
        super(nama,nip);
        this.upahMingguan = upahMingguan;
    }
    public void setUpahMingguan(int upahMingguan){
        this.upahMingguan = upahMingguan;
    }
    public int getUpahMingguan(){
        return upahMingguan;
    }
    public void menghitungGaji(){
        gaji = upahMingguan;
        System.out.println("GAJI                : Rp "+gaji);
    }
    public void cetakInformasi(){
        System.out.println("NAMA                : "+nama);
        System.out.println("NIP                 : "+nip);
        System.out.println("UPAH MINGGUAN       : Rp "+upahMingguan);
        menghitungGaji();
    }  
}
