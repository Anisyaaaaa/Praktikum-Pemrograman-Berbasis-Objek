public class User implements Ticketable {
    @Override
    public void bookTicket(String movieTitle, String seatNumber, int ticketCount, double ticketPrice) {
        // Proses pemesanan tiket
        double totalPrice = ticketPrice * ticketCount;
        System.out.println("\t");
        System.out.println("=============== TIKET BERHASIL DIPESAN ====================");
        System.out.println("Judul Film: " + movieTitle);
        System.out.println("Nomor Kursi: " + seatNumber);
        System.out.println("Jumlah Tiket: " + ticketCount);
        System.out.println("Total Harga: " + totalPrice);

        // Tampilkan struk
        System.out.println("\t");
        System.out.println("============================================================");
        System.out.println("                    STRUK PEMBAYARAN                        ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Judul Film: " + movieTitle);
        System.out.println("Nomor Kursi: " + seatNumber);
        System.out.println("Jumlah Tiket: " + ticketCount);
        System.out.println("Harga Tiket: " + ticketPrice);
        System.out.println("Total Harga: " + totalPrice);
    }
}
