/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspolymorphism;

/**
 *
 * @author Vino Alana
 */
public class Mahasiswa extends WargaKampus{

    @Override
    void Data() {
        System.out.println( nama + " berusia " + umur + " tahun, \n" + nama + " adalah mahasiswa dan tugasnya adalah menuntut ilmu");
    }

    @Override
    int JamIstirahat() {
        return 30;
    }

    @Override
    void BarangBawaan() {
        System.out.println("Mahasiswa biasanya membawa ransel berisi buku atau laptop");    
    }

    @Override
    public void Sepatu() {
        System.out.println("Sepatu yang digunakan mahasiswa bebas");    
    }

    @Override
    public void Seragam() {
        System.out.println("Mahasiswa menggunakan seragam putih hitam saat hari senin dan selasa, \nUntuk hari lainnya bebas sopan");    
    }

    @Override
    public void WarnaKaosKaki() {
        System.out.println("Tidak ada warna khusus untuk kaos kaki yang dipakai");    }
    
}