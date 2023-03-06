/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspolymorphism;

/**
 *
 * @author Vino Alana
 */
public class Dosen extends WargaKampus{

    @Override
    void Data() {
        System.out.println( nama + " berusia " + umur + " tahun, \n" + nama + " adalah dosen dan tugasnya adalah mengajari mahasiswa");
    }

    @Override
    int JamIstirahat() {
    return 60;
    }

    @Override
    void BarangBawaan() {
        System.out.println("Dosen biasanya membawa laptop dan dokumen kampus");    }

    @Override
    public void Sepatu() {
        System.out.println("Sepatu yang digunakan dosen adalah sepatu formal");    }

    @Override
    public void Seragam() {
        System.out.println("Dosen menggunakan seragam sesuai jadwal hari yang telah ditentukan oleh universitas");    }

    @Override
    public void WarnaKaosKaki() {
        System.out.println("Warna kaos kaki yang dipakai dosen harus hitam atau putih");    }
    
}