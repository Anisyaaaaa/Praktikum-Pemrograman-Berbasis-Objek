package Project2;
import java.util.Scanner;

public class DataMahasiswa {
    String kampus; //Atribut
    DataMahasiswa() { //Constructor
        System.out.println("Selamat Datang!"); 
    }

    void setkampus (String Kampus) { //Setter
        kampus = kampus;
    }
    String getkampus() { //Getter
        return kampus; //Mengambil atau Mengembalikan Atribut
    }
    
    public static void main (String[] args) {
        DataMahasiswa DataMhs = new DataMahasiswa(); //Object
        Scanner scan = new Scanner(System.in); //Object
                
        DataMhs.kampus = "Universitas Trunojoyo Madura"; 
        System.out.println("Kampus : " + DataMhs.getkampus()); 
        
        while(true) {
            System.out.println("Silahkan Masukkan Nama Anda : ");
            String nama = scan.nextLine();
            
            System.out.println("Silahkan Masukkan NIM Anda : ");
            String nim = scan.nextLine();
            
            System.out.println("Silahkan Masukkan Alamat Anda : ");
            String alamat = scan.nextLine();
            
            System.out.println("===== Jurusan =====");
            String opsi = scan.nextLine();
                String jurusan = "";
                switch (opsi) { //Untuk Memeriksa Inputan User
                    case "41":
                    jurusan = "TEKNIK INFORMATIKA";
                        break;
                        
                    case "42":
                    jurusan = "TEKNIK INDUSTRI";
                        break;
                        
                    case "43":
                        jurusan = "TEKNIK ELEKTRO";
                        break;
                        
                    case "44":
                        jurusan = "SISTEM INFORMASI";
                        break;
                        
                    case "48":
                        jurusan = "TEKNIK MESIN";
                        break;
                        
                    case "49":
                        jurusan = "TEKNIK MEKATRONIKA";
                        break;
                    
                    case "-":
                        jurusan = "Tidak Tersedia";
                        break;
                    
                    default:
                        break;
                }
                
                System.out.println("==================");
                System.out.println("Nama    : " + nama);
                System.out.println("NIM     : " + nim);
                System.out.println("Alamat  : " + alamat);
                System.out.println("Jurusan : " + jurusan);
                System.out.println("==================");

                
                System.out.println("Apakah Ingin Mengulang atau Tidak? Y/T");
                String ulang = scan.nextLine();
                if("T".equals(ulang)) {
                    break;
                }

        }
        
    }
    
}


