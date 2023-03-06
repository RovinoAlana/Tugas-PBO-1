/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspolymorphism;

import java.util.Scanner;

/**
 *
 * @author Vino Alana
 */
public class TugasPolymorphism {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        boolean ulang;
        Scanner scn = new Scanner(System.in);
        WargaKampus warga = null;
        do{
            try{
                ulang = true;
        System.out.print("1. Dosen \n2. Mahasiswa \n3. Satpam \nPilih : ");
        pilih = scn.nextInt();
        scn.nextLine();
        switch(pilih){
            case 1:
                warga = new Dosen();
                System.out.println("Nama \t: ");
                warga.nama = scn.nextLine();
                System.out.println("Umur \t:");
                warga.umur = scn.nextInt();
                break;
            case 2:
                warga = new Mahasiswa();
                System.out.println("Nama \t: ");
                warga.nama = scn.nextLine();
                System.out.println("Umur \t:");
                warga.umur = scn.nextInt();
                break;
            case 3:
                warga = new Satpam();
                System.out.println("Nama \t: ");
                warga.nama = scn.nextLine();
                System.out.println("Umur \t:");
                warga.umur = scn.nextInt();
                break;
            default:
                System.out.println("Masukkan nomor 1-3");
                ulang = false;
                break;
        }
        
            }catch(Exception error){
                System.out.println("Masukkan Integer");
                System.out.println("Press enter to continue...");
                scn.nextLine();
                scn.nextLine();
                ulang = false;       
            }
        }while(ulang == false);
        warga.Data();
        System.out.println("Jam Istirahat " + warga.JamIstirahat()+ " menit");
        warga.BarangBawaan();
        warga.Sepatu();
        warga.WarnaKaosKaki();
    }
        
        
    }
    
