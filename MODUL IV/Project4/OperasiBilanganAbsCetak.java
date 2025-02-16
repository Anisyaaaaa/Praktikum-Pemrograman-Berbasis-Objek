package Project4;

public class OperasiBilanganAbsCetak {
    private static void Main(OperasiBilanganAbs[]OBA, double a, double b){
        OBA[0] = new OperasiPenjumlahan();
        OBA[1] = new OperasiPengurangan();
        OBA[2] = new OperasiPerkalian();
        OBA[3] = new OperasiPembagian();

        for (int x = 0; x < OBA.length; x++) {
        OBA[x].set_A(a);
        OBA[x].set_B(b);
        OBA[x].set_C();
        OBA[x].tampil();
        }
        }
        public static void main(String[]args){
        OperasiBilanganAbs[] A = new OperasiBilanganAbs [4];
        Main(A, 6.5, 0.5);
    }
}