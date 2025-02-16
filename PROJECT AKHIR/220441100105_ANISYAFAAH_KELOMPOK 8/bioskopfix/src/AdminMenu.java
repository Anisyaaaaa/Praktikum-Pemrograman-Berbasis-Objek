import java.util.Scanner;
import java.util.HashMap;

public class AdminMenu extends Menu {
    private Scanner scanner;
    private HashMap<Integer, String> movieTitles;
    private HashMap<Integer, Integer> movieSeats;
    private HashMap<Integer, Double> moviePrices;

    public AdminMenu(HashMap<Integer, String> movieTitles, HashMap<Integer, Integer> movieSeats,
            HashMap<Integer, Double> moviePrices) {
        scanner = new Scanner(System.in);
        this.movieTitles = movieTitles;
        this.movieSeats = movieSeats;
        this.moviePrices = moviePrices;
    }

    public void showMenu() {
        int choice;

        do {
            showMovieList();
            System.out.println("\t");
            System.out.println("=================== MENU ADMIN =======================");
            System.out.println("1. Tambah Film");
            System.out.println("2. Hapus Film");
            System.out.println("0. Kembali");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    deleteMovie();
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (choice != 0);
    }

    private void addMovie() {
        // Ambil input dari admin mengenai judul film, jumlah kursi, dan harga film
        System.out.println("\t");
        System.out.println("================ MENAMBAHKAN FILM =====================");
        System.out.print("Judul Film: ");
        String title = scanner.next();
        System.out.print("Jumlah Kursi: ");
        int seats = scanner.nextInt();
        System.out.print("Harga Tiket: ");
        double price = scanner.nextDouble();

        // Generate nomor film baru
        int movieNumber = movieTitles.size() + 1;

        // Tambahkan data film ke dictionary
        movieTitles.put(movieNumber, title);
        movieSeats.put(movieNumber, seats);
        moviePrices.put(movieNumber, price);

        System.out.println("Film berhasil ditambahkan!");
    }

    private void deleteMovie() {
        // Ambil input dari admin mengenai nomor film yang akan dihapus
        System.out.print("Nomor Film yang akan dihapus: ");
        int movieNumber = scanner.nextInt();

        // Hapus data film dari dictionary
        movieTitles.remove(movieNumber);
        movieSeats.remove(movieNumber);
        moviePrices.remove(movieNumber);

        System.out.println("Film dengan nomor " + movieNumber + " berhasil dihapus!");
    }
    
    private void showMovieList() {
        System.out.println("================== DAFTAR FILM =======================");
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
}