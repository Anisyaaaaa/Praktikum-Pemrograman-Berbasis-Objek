package Project1;

import java.util.Scanner;
        
public class Mahasiswa {
    
    String nama;
    String nim;
    String jurusan;
    String alamat;
    
    public static void main (String[] args) {
    
    Scanner input = new Scanner (System.in);

    Mahasiswa data = new Mahasiswa();

    System.out.println("Silahkan Masukkan Nama Anda : ");
    data.nama = input.nextLine();
    
    System.out.println("Silahkan Masukkan NIM Anda : ");
    data.nim = input.nextLine();
    
    System.out.println("Silahkan Masukkan Jurusan Anda : ");
    data.jurusan = input.nextLine();
    
    System.out.println("Silahkan Masukkan Alamat Anda : ");
    data.alamat = input.nextLine();
    
        System.out.println("--------------------");
        System.out.println("Nama    : " + data.nama);
        System.out.println("NIM     : " + data.nim);
        System.out.println("Jurusan : " + data.jurusan);
        System.out.println("Alamat  : " + data.alamat);

    }
}
