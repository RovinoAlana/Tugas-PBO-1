/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspolymorphism;

/**
 *
 * @author Vino Alana
 */
public class Satpam extends WargaKampus{

    @Override
    void Data() {
        System.out.println( nama + " berusia " + umur + " tahun, \n" + nama + " adalah satpam dan tugasnya adalah menjaga keamanan kampus");
    }

    @Override
    int JamIstirahat() {
    return 120;
    }

    @Override
    void BarangBawaan() {
        System.out.println("Satpam biasanya membawa tongkat dan senter");    }

    @Override
    public void Sepatu() {
        System.out.println("Sepatu yang digunakan satpam adalah sepatu boots");    }

    @Override
    public void Seragam() {
        System.out.println("Satpam memiliki 2 seragam yang berwarna hitam dan putih");    }

    @Override
    public void WarnaKaosKaki() {
        System.out.println("Warna kaos kaki yang dipakai satpam harus hitam atau putih");    }
    
}