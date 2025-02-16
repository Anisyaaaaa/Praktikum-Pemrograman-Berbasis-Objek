package Project5;

public final class OperasiBilanganCetak {
    private static void Cetak(OperasiBilangan[]OB, double a, double b, double c){
        OB[0] = new OperasiPenjumlahan();
        OB[1] = new OperasiPengurangan();
        OB[2] = new OperasiPerkalian();
        OB[3] = new OperasiPembagian();
        
        for (int i=0; i < OB.length; i++){
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C(c);
            OB[i].set_D();
            OB[i].tampil();
        }
    }
    
    public static void main(String[] args) {
        OperasiBilangan[] A = new OperasiBilangan[4];
        Cetak(A, 10.5, 0.5, 1.25);
    }
}