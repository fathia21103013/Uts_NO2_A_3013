/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectemployee_3013;

/**
 *
 * @author ASUS
 */
public class Salaried_employee_3013 extends Employee_3013{

    
    public Salaried_employee_3013(){
        
    }
    
    public void TampilData(){
        System.out.println("Salaried Employee");
        Tampil();
        System.out.println("Total Gaji: " + GajiPokok);
    }
}
