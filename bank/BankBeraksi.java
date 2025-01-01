package bank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bank = new Bank(100000);
        
        System.out.println("Selamat Datang di Bank Afta");
        bank.getSaldo();
        
        System.out.println(); // Baris kosong
        
        bank.simpanUang(500000);
        
        System.out.println(); // Baris kosong
        
        bank.ambilUang(150000);
    }
}