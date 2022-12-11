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
public class CommissionEmployee_3013 extends Employee_3013{
    private int gajiPokok,komisi,totalPenjualan; 
    int gaji;
    private String nama;
    private String nip;
    
    public CommissionEmployee_3013(String nama, String nip, int gajiPokok,
        int komisi,int totalPenjualan){
        super(nama,nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }
    public void setGajiPokok(int gajipokok){
        this.gajiPokok = gajipokok;
    }
    public void setKomisi(int komisi){
        this.komisi = komisi;
    }
    public void setTotalPenjualan(int totalPenjualan){
        this.totalPenjualan = totalPenjualan;
    }
    public int getGajiPokok(){
        return gajiPokok;
    }
    public int getKomisi(){
        return komisi;
    }
    public int getTotalPenjualan(){
        return totalPenjualan;
    }
    public void menghitungGaji(){
        gaji = gajiPokok + (komisi*totalPenjualan);
        System.out.println("GAJI                : Rp "+gaji);
    }
    public void cetakInformasi(){
        System.out.println("NAMA                : "+nama);
        System.out.println("NIP                 : "+nip);
        System.out.println("GAJI POKOK          : Rp "+gajiPokok);
        System.out.println("KOMISI              : Rp "+komisi);
        System.out.println("TOTAL PENJUALAN     : "+totalPenjualan);
        menghitungGaji();
    }
}
