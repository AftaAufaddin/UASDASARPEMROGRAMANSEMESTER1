/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author ADVAN
 */
public class MobilBeraksi {
    public static void main(String[] args){
        Mobil mobilAfta = new Mobil();
        
        mobilAfta.warna = "Hitam";
        mobilAfta.tahunProduksi = 1987;
        
        System.out.println("Warna: "+ mobilAfta.warna);
        System.out.println("Tahun Produksi: " + mobilAfta.tahunProduksi);
    }
    
}
