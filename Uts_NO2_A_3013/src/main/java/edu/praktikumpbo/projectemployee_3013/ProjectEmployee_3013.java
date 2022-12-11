/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.projectemployee_3013;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 * Nama : Fathia Ismi Rahma
 * NIM  : 21103013
 */
public class ProjectEmployee_3013 {

    public static void main(String[] args) {
        CommissionEmployee_3013 C = new CommissionEmployee_3013("Fathia Ismi Rahma", 
             "99922111", 5000000, 50000, 100);
        ProjectPlanner_3013 P = new ProjectPlanner_3013("Fafa Angelica", "9988162625", 
             1000000, 100000, 8);
        Salaried_employee_3013 S = new Salaried_employee_3013("Tectonia Laurana", "1122887537", 
             100000);

        System.out.println("\t== Data Comission Employee ==");
        C.cetakInformasi();
        System.out.println("");
        System.out.println("\t== Data Project Planner ==");
        P.cetakInformasi();
        System.out.println("");
        System.out.println("\t== Data Salaried Employee ==");
        S.cetakInformasi();
    }
}
