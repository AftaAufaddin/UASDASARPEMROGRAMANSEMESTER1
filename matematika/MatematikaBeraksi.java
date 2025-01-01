/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author ADVAN
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtkBeraksi = new Matematika();
        
        mtkBeraksi.setTambah(20, 20);
        System.out.println("Hasil= " + mtkBeraksi.getTambah());
        
        mtkBeraksi.setKurang(10, 5);
        System.out.println("Hasil= " + mtkBeraksi.getKurang());
        
        mtkBeraksi.setKali(10, 20);
        System.out.println("Hasil= " + mtkBeraksi.getKali());
        
        mtkBeraksi.setBagi(21, 2);
        System.out.println("Hasil= " + mtkBeraksi.getBagi());
    }
}
