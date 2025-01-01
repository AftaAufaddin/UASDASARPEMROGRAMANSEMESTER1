/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author ADVAN
 */
public class AC implements InterfaceAC {
    int statusAC;
    int suhuAC;

    public void hidupkanAC() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! --> AC Hidup");
        } else {
            System.out.println("Hidupkan AC! --> AC Sudah Hidup Bos");
        }
    }

    public void matikanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! --> AC Mati");
        } else {
            System.out.println("Matikan AC! --> AC Sudah Mati Bos");
        }
    }

    public void dinginkanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            suhuAC = KEADAAN_DINGIN;
            System.out.println("Dinginkan AC! --> AC Menjadi Dingin");
        } else {
            System.out.println("Dinginkan AC! --> AC Masih Mati, Nyalakan Dulu!");
        }
    }

    public void panaskanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            suhuAC = KEADAAN_PANAS;
            System.out.println("Panaskan AC! --> AC Menjadi Panas");
        } else {
            System.out.println("Panaskan AC! --> AC Masih Mati, Nyalakan Dulu!");
        }
    }
}
