package Project5;

public class OperasiPerkalian extends OperasiBilangan{
    @Override
    protected void set_D(){
        this.d = a*b*c;
    }

    @Override
    protected void tampil(){
        System.out.println("\n  P E R K A L I A N  ");
        System.out.println("-------------------------");
        System.out.println("Bilangan A  : "+this.get_A());
        System.out.println("Bilangan B  : "+this.get_B());
        System.out.println("Bilangan C  : "+this.get_C());
        System.out.println("Hasil A*B*C : "+this.get_D());
    }
}