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
public class ProjectPlanner_3013 extends Employee_3013{
    private int gajiPokok, komisi, totalHasilProyek;
    float pajak;
    int gaji;
    
    public ProjectPlanner_3013(String nama, String nip, int gajiPokok, 
        int komisi, int totalHasilProyek){
        super(nama,nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }
    public void setGajiPokok(int gajipokok){
        this.gajiPokok = gajipokok;
    }
    public void setKomisi(int komisi){
        this.komisi = komisi;
    }
    public void setTotalHasilProyek(int totalHasilProyek){
        this.totalHasilProyek = totalHasilProyek;
    }
    public int getGajiPokok(){
        return gajiPokok;
    }
    public int getKomisi(){
        return komisi;
    }
    public int getTotalHasilProyek(){
        return totalHasilProyek;
    }
    public void menghitungGaji(){
        pajak = (float) (0.05*gajiPokok);
        gaji = (int) (gajiPokok + (komisi*totalHasilProyek)-pajak);
        System.out.println("GAJI                : Rp "+gaji);
    }
    public void cetakInformasi(){
        System.out.println("NAMA                : "+nama);
        System.out.println("NIP                 : "+nip);
        System.out.println("GAJI POKOK          : Rp "+gajiPokok);
        System.out.println("KOMISI              : Rp "+komisi);
        System.out.println("TOTAL HASIL PROYEK  : "+totalHasilProyek);
        menghitungGaji();
    }
}
