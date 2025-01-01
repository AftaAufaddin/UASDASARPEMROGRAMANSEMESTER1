/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author ADVAN
 */
public class Matematika {
    int tambah;
    int kurang;
    int kali;
    int bagi;
    
    //method mutator
    void setTambah(int a, int b){
        tambah = a+b;
    }
    void setKurang(int a, int b){
        kurang = a-b;
    }
    void setKali(int a, int b){
        kali = a*b;
    }
    void setBagi(int a, int b){
        bagi = a/b;
    }
    
    //method assesor
    int getTambah(){
        return tambah;
    }
    
    int getKurang(){
        return kurang;
    }
    int getKali(){
        return kali;
    }
    int getBagi(){
        return bagi;
    }




    

}