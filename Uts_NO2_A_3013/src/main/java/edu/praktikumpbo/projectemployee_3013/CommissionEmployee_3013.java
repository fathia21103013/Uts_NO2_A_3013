/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectemployee_3013;

/**
 *
 * @author ASUS
 */
public class CommissionEmployee_3013 extends Employee_3013{
    public float Komisi;
    public float TotalPenjualan;
    public float Totalgaji;
    
    public CommissionEmployee_3013(){
        
    }
    
    public float TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalPenjualan);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}
