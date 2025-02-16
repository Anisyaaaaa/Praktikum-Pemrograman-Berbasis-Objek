import java.util.Scanner;
import java.util.HashMap;


public class UserMenu extends Menu {
    private Scanner scanner;
    private HashMap<Integer, String> movieTitles;
    private HashMap<Integer, Integer> movieSeats;
    private HashMap<Integer, Double> moviePrices;

    public UserMenu(HashMap<Integer, String> movieTitles, HashMap<Integer, Integer> movieSeats,
            HashMap<Integer, Double> moviePrices) {
        scanner = new Scanner(System.in);
        this.movieTitles = movieTitles;
        this.movieSeats = movieSeats;
        this.moviePrices = moviePrices;
    }

    @Override
    public void showMenu() {
        int choice;

        do {
            System.out.println("\t");
            System.out.println("=================== MENU USER =======================");
            System.out.println("1. Lihat Daftar Film");
            System.out.println("2. Pesan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showMovieList();
                    break;
                case 2:
                    bookTicket();
                    break;
                case 0:
                    System.out.println("Keluar dari menu user.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (choice != 0);
    }

    private void showMovieList() {
        System.out.println("\t");
        System.out.println("=================== DAFTAR FILM =======================");
        for (int movieNumber : movieTitles.keySet()) {
            String title = movieTitles.get(movieNumber);
            int availableSeats = movieSeats.get(movieNumber);
            double price = moviePrices.get(movieNumber);
            System.out.println("Nomor Film: " + movieNumber);
            System.out.println("Judul Film: " + title);
            System.out.println("Kursi Tersedia: " + availableSeats);
            System.out.println("Harga Tiket: " + price);
            System.out.println();
        }
    }

    private void bookTicket() {
        // Ambil input dari pengguna mengenai nomor film, nomor kursi, dan jumlah tiket
        System.out.println("\t");
        System.out.print("Nomor Film: ");
        int movieNumber = scanner.nextInt();
        System.out.print("Nomor Kursi: ");
        String seatNumber = scanner.next();
        System.out.print("Jumlah Tiket: ");
        int ticketCount = scanner.nextInt();

        // Periksa ketersediaan kursi
        int availableSeats = movieSeats.getOrDefault(movieNumber, 0);
        if (availableSeats >= ticketCount) {
            // Kurangi jumlah kursi yang tersedia
            movieSeats.put(movieNumber, availableSeats - ticketCount);

            // Panggil metode untuk memesan tiket
            Ticketable user = new User();
            user.bookTicket(movieTitles.get(movieNumber), seatNumber, ticketCount, moviePrices.get(movieNumber));
        } else {
            System.out.println("Maaf, kursi tidak tersedia.");
        }
    }
}
