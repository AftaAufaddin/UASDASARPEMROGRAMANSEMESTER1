/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

import java.util.Scanner;

/**
 *
 * @author ADVAN
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai 2 : ");
        int nilai2 = input.nextInt();
        
        System.out.println("Hasil Pertambahan " + nilai1 + " + " +nilai2 + " = " + mtk.pertambahan(nilai1, nilai2));
        System.out.println("Hasil Perkalian " + nilai1 + " * " +nilai2 + " = " + mtk.perkalian(nilai1, nilai2));
        System.out.println("Hasil Modulus " + nilai1 + " % " +nilai2 + " = " + mtk.modulus(nilai1, nilai2));
    }
}