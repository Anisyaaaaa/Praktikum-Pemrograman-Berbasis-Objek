package Project3;

public class Perpustakaan extends Sewa { //Override
    String penulis; //Atribut
    String kategori;
    int tahunterbit;
    
    
    Perpustakaan (String penulis, String kategori, String judul, String publisher, int tahunterbit, int stok) { //Constructor
        super(judul, publisher, stok); //Mengakses Parent Class
                
        this.penulis = penulis; //Mengambil Atribut secara Khusus
        this.kategori = kategori;
        this.tahunterbit = tahunterbit;
    }
    
    Perpustakaan(){
        
    }
}