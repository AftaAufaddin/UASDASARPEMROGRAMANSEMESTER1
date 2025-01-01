/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author ADVAN
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC acKamar = new AC();

        System.out.println("Status AC Saat Ini: Mati");

        acKamar.hidupkanAC();    // Hidupkan AC
        acKamar.dinginkanAC();   // Dinginkan AC
        acKamar.panaskanAC();    // Panaskan AC
        acKamar.matikanAC();     // Matikan AC
        acKamar.dinginkanAC();   // Coba dinginkan saat mati
        acKamar.hidupkanAC();    // Hidupkan lagi
        acKamar.panaskanAC();    // Panaskan AC
    }
}