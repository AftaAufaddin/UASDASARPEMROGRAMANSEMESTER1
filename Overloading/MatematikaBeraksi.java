/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author ADVAN
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        
        // Testing original methods
        mtk.setTambah(20, 20);
        System.out.println("Hasil Tambah = " + mtk.getTambah());
        
        mtk.setKurang(10, 5);
        System.out.println("Hasil Kurang = " + mtk.getKurang());
        
        mtk.setKali(10, 20);
        System.out.println("Hasil Kali = " + mtk.getKali());
        
        mtk.setBagi(21, 2);
        System.out.println("Hasil Bagi = " + mtk.getBagi());
        
        System.out.println("\nUji Overloading:");
        System.out.println("Pertambahan(12.5, 28.7, 14.2) = " + mtk.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan(12, 28, 14) = " + mtk.pertambahan(12, 28, 14));
        System.out.println("Pertambahan(23, 34) = " + mtk.pertambahan(23, 34));
        System.out.println("Pertambahan(3.4, 4.9) = " + mtk.pertambahan(3.4, 4.9));
    }
}