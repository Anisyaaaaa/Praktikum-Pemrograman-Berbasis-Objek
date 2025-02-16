package Project1;

class Manusia{
    
    String nama;
    int umur;
    String alamat;
    
    void berjalan() {
        System.out.println("Suka Berjalan");
    }
    
    void berlari() {
        System.out.println("Suka Berlari");
    }
    
    public static void main(String[] args) {

    Manusia orang1 = new Manusia();
    Manusia orang2 = new Manusia();
    
    orang1.nama = "Anisa";
    orang1.umur = 18;
    orang1.alamat = "Bangkalan";
    
    orang2.nama = "Putri";
    orang2.umur = 19;
    orang2.alamat = "Gresik";
    
        System.out.println("----- OBJECT 1 -----");
        System.out.println("Namaku adalah : " + orang1.nama);
        System.out.println("Umurku        : " + orang1.umur);
        System.out.println("Alamatku di   : " + orang1.alamat);
        orang1.berjalan();
        
        System.out.println("----- OBJECT 2 -----");
        System.out.println("Temanku bernama  : " + orang2.nama);
        System.out.println("Umurnya          : " + orang2.umur);
        System.out.println("Alamatnya di     : " + orang2.alamat);
        orang2.berlari();
        }

    }