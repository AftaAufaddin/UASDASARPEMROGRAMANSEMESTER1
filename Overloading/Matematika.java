/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author ADVAN
 */
public class Matematika {
    private int tambah;
    private int kurang;
    private int kali;
    private int bagi;
    
    // Original integer methods
    void setTambah(int a, int b) {
        tambah = a + b;
    }
    
    void setKurang(int a, int b) {
        kurang = a - b;
    }
    
    void setKali(int a, int b) {
        kali = a * b;
    }
    
    void setBagi(int a, int b) {
        bagi = a / b;
    }
    
    // Overloaded methods for 3 parameters
    int pertambahan(int a, int b) {
        return a + b;
    }
    
    int pertambahan(int a, int b, int c) {
        return a + b + c;
    }
    
    double pertambahan(double a, double b) {
        return a + b;
    }
    
    double pertambahan(double a, double b, double c) {
        return a + b + c;
    }
    
    // Getter methods
    int getTambah() {
        return tambah;
    }
    
    int getKurang() {
        return kurang;
    }
    
    int getKali() {
        return kali;
    }
    
    int getBagi() {
        return bagi;
    }
}
