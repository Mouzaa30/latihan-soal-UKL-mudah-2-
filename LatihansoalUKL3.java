/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihansoalukl3;

/**
 *
 * @author mouza
 */
//soal no 1 (2)
import java.util.Scanner;
public class LatihansoalUKL3 {

    public static void main(String[] args) {
         Scanner masukan = new Scanner (System.in);
        int bilangan1;
        System.out.print("Masukkan Bilangan : ");
        bilangan1 = masukan.nextInt();
        if(bilangan1 % 2 == 0){
     System.out.println("Bilangan Genap");
     System.out.println("Bilangan ini bisa di bagi 2");
    }else{  
      System.out.println("Bilangan Ganjil");
      System.out.println("Bilangan ini tidak bisa di bagi 2");
        }
    }
}
