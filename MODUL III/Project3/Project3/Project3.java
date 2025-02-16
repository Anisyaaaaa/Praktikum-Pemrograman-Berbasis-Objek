package Project3;
import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {
         
        int user = 0, repeat;
        do{ //Melakukan Perulangan Selama Kondisinya Bernilai w 
            Scanner input = new Scanner(System.in); //Object
            Perpustakaan daftar = new Perpustakaan();
            System.out.println("===== ENTRI DATA BUKU =====");
            System.out.print(" Judul : ");
            daftar.judul = input.nextLine();
            System.out.print(" Penulis : ");
            daftar.penulis = input.nextLine();
            System.out.print(" Publisher: ");
            daftar.publisher = input.nextLine();
            System.out.print(" Tahun Terbit : ");
            daftar.tahunterbit = input.nextInt();
            System.out.println("===== Kategori =====");
            System.out.println("1. SU = Semua Umur\n2. D = Dewasa\n3. R = Remaja\n4. A = Anak-anak");
            System.out.print("Silahkan Masukkan Pilihan Anda (1/2/3/4): ");
            user = input.nextInt();
            if(user==1){
                daftar.kategori= "Semua Umur";
            }
            else if(user==2){
                daftar.kategori= "Dewasa";
            }
            else if(user==3){
                daftar.kategori= "Remaja";
            }
            else if(user==4){
                daftar.kategori= "Anak - anak";
            }
            else {
                daftar.kategori= "Pilihan Tidak Tersedia";
            }
            System.out.print("Stok : ");
            daftar.stok=input.nextInt();
            System.out.println("===== HASIL ENTRI DATA =====");
            System.out.println("Judul Buku   : " + daftar.judul);
            System.out.println("Nama Penulis : " + daftar.penulis);
            System.out.println("Publisher    : " + daftar.publisher);
            System.out.println("Tahun Terbit : " + daftar.tahunterbit);
            System.out.println("Kategori     : " + daftar.kategori);
            System.out.println("Stok         : " + daftar.stok);
            System.out.println("============================");
            
            System.out.println("Apakah Ingin Mengulang Kembali? (1/2) : ");
            System.out.println("1 = Ya / 2 = Tidak");
            System.out.print("Silahkan Masukkan Pilihan Anda : ");
            System.out.print("\n");
            repeat=input.nextInt(); //Perulangan 
            
        }
        
        while(repeat<2);
        System.out.println("Terima Kasih!");
    }
}
