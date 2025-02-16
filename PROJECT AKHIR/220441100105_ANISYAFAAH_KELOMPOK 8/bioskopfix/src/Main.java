import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Data judul film, harga film, dan jumlah kursi
        HashMap<Integer, String> movieTitles = new HashMap<>();
        HashMap<Integer, Double> moviePrices = new HashMap<>();
        HashMap<Integer, Integer> movieSeats = new HashMap<>();

        do {
            System.out.println("\t");
            System.out.println("========= SISTEM PEMESANAN TIKET BIOSKOP =============");
            System.out.println("\t");
            System.out.println("Ingin Login Sebagai?");
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            System.out.println("\t");

            switch (choice) {
                case 1:
                    UserMenu userMenu = new UserMenu(movieTitles, movieSeats, moviePrices);
                    userMenu.showMenu();
                    break;
                case 2:
                    AdminMenu adminMenu = new AdminMenu(movieTitles, movieSeats, moviePrices);
                    adminMenu.showMenu();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}