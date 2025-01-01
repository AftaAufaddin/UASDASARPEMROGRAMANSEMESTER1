/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package handphone;

/**
 *
 * @author ADVAN
 */
public class Handphone {
    String hidupkan;
    int lakukanPanggilan;
    int kirimSMS;
    String matikan;
   
    void printHp () {
        System.out.println("Handphone Hidup " + hidupkan);
        System.out.println("Duar, duar, duar...... " + lakukanPanggilan + " panggilan dilakukan");
        System.out.println("Brak, brak...... " + kirimSMS + " sms berhasil terkirim");
        System.out.println("Handphone matot " + matikan);
    }
    
}
