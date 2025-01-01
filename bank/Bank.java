/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author ADVAN
 */
public class Bank {
    private int saldo;
    
    public Bank(int saldo) {
        this.saldo = saldo;
    }
    
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        getSaldo();
    }
    
    public void ambilUang(int jumlah) {
        saldo -= jumlah;
        System.out.println("Ambil uang: Rp. " + jumlah);
        getSaldo();
    }
    
    public void getSaldo() {
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }
}
