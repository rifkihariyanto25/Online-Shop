import java.util.Scanner;

public class onlineshop {
    public static void main(String[] args) {
        int pilihanBarang, jumlahBarang = 0;
        float totalHarga = 0;
        String namaBarang = "", alamat, nomorTelepon;
        int hargaKemeja = 100000, hargaKaos = 75000, hargaSweater = 150000;
        int hargaCelana = 50000, hargaSandal = 45000, hargaSepatu = 80000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Toko Belanja Online");
        System.out.println("Silahkan Pilih Pakaian Yang Ingin diBeli");
        System.out.println("1. Kemeja Rp 100.000");
        System.out.println("2. Kaos Rp 75.000");
        System.out.println("3. Sweater Rp 150.000");
        System.out.println("4. Celana Rp 50.000");
        System.out.println("5. Sandal Rp 45.000");
        System.out.println("6. Sepatu Rp 80.000");
        System.out.println("Jika Anda Membeli Lebih Dari 300.000 Akan Mendapatkan Diskon Sebesar 5%");
        System.out.print("Masukkan Nomor Barang Yang Ingin diBeli: ");
        pilihanBarang = scanner.nextInt();

        switch (pilihanBarang) {
            case 1:
                namaBarang = "Kemeja";
                System.out.println(namaBarang);
                System.out.print("Masukkan Jumlah Kemeja Yang Ingin diBeli: ");
                jumlahBarang = scanner.nextInt();
                totalHarga = jumlahBarang * hargaKemeja;
                break;

            case 2:
                namaBarang = "Kaos";
                System.out.println(namaBarang);
                System.out.print("Masukkan Jumlah Kaos Yang Ingin diBeli: ");
                jumlahBarang = scanner.nextInt();
                totalHarga = jumlahBarang * hargaKaos;
                break;

            case 3:
                namaBarang = "Sweater";
                System.out.println(namaBarang);
                System.out.print("Masukkan Jumlah Sweater Yang Ingin diBeli: ");
                jumlahBarang = scanner.nextInt();
                totalHarga = jumlahBarang * hargaSweater;
                break;

            case 4:
                namaBarang = "Celana";
                System.out.println(namaBarang);
                System.out.print("Masukkan Jumlah Celana Yang Ingin diBeli: ");
                jumlahBarang = scanner.nextInt();
                totalHarga = jumlahBarang * hargaCelana;
                break;

            case 5:
                namaBarang = "Sandal";
                System.out.println(namaBarang);
                System.out.print("Masukkan Jumlah Sandal Yang Ingin diBeli: ");
                jumlahBarang = scanner.nextInt();
                totalHarga = jumlahBarang * hargaSandal;
                break;

            case 6:
                namaBarang = "Sepatu";
                System.out.println(namaBarang);
                System.out.print("Masukkan Jumlah Sepatu Yang Ingin diBeli: ");
                jumlahBarang = scanner.nextInt();
                totalHarga = jumlahBarang * hargaSepatu;
                break;

            default:
                System.out.println("Maaf, pilihan Anda tidak valid.");
                break;
        }

        if (totalHarga > 300000) {
            totalHarga -= totalHarga * 0.05f;
            System.out.println("Anda Mendapatkan Diskon Sebesar 5% Karena Pembelian di Atas 300.000");
        }
        System.out.println("Jumlah Yang Harus diBayar Sebesar Rp " + totalHarga);

        System.out.println("Silahkan Memilih Metode Pembayaran:");
        System.out.println("1. COD");
        System.out.println("2. ATM");
        System.out.println("3. Indomaret");
        int pilihanPembayaran = scanner.nextInt();
        scanner.nextLine(); // membersihkan buffer

        switch (pilihanPembayaran) {
            case 1:
                System.out.print("Masukkan Alamat Anda: ");
                alamat = scanner.nextLine();
                System.out.print("Masukkan Nomor Telepon Anda: ");
                nomorTelepon = scanner.nextLine();
                System.out.println("Kurir kami akan mengirimkan pesanan Anda ke alamat: " + alamat);
                break;

            case 2:
                System.out.println("Silahkan Transfer ke Rekening Kami: 123454");
                break;

            case 3:
                System.out.println("Silahkan Datang ke Indomaret Terdekat dari Anda");
                break;

            default:
                System.out.println("Maaf, pilihan Anda tidak valid.");
                break;
        }

        System.out.println("Apakah Anda Ingin Mencetak Struk Belanja? (Ya/Tidak)");
        String cetakStruk = scanner.nextLine();
        if (cetakStruk.equalsIgnoreCase("Ya")) {
            System.out.println("=============== Struk Belanja ===============");
            System.out.println("Barang : " + namaBarang);
            System.out.println("Jumlah : " + jumlahBarang);
            System.out.println("Total Yang Harus diBayar : Rp " + totalHarga);
            System.out.println("=============================================");
        } else {
            System.out.println("Terima kasih telah berbelanja bersama kami!");
        }
    }
}
