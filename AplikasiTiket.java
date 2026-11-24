
import java.util.Scanner;

public class AplikasiTiket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama, tujuan;
        int jumlahTiket, hargaTiket;
        int totalBayar;

        System.out.println("==================================");
        System.out.println("       APLIKASI PEMBELIAN TIKET");
        System.out.println("==================================");

        // Input data pemesan
        System.out.print("Masukkan nama pemesan : ");
        nama = sc.nextLine();

       
        System.out.println("\nDaftar Tujuan dan Harga Tiket");
        System.out.println("1. Bekasi - Bandung   : Rp75.000");
        System.out.println("2. Bekasi - Jakarta   : Rp30.000");
        System.out.println("3. Bekasi - Semarang  : Rp120.000");
        System.out.println("4. Bekasi - Jogja     : Rp150.000");
        System.out.println("5. Bekasi - Surabaya  : Rp250.000");

        System.out.print("\nPilih tujuan (1-5) : ");
        int pilihan = sc.nextInt();

        // Menentukan tujuan dan harga tiket
        if (pilihan == 1) {
            tujuan = "Bekasi - Bandung";
            hargaTiket = 75000;
        }
        else if (pilihan == 2) {
            tujuan = "Bekasi - Jakarta";
            hargaTiket = 30000;
        }
        else if (pilihan == 3) {
            tujuan = "Bekasi - Semarang";
            hargaTiket = 120000;
        }
        else if (pilihan == 4) {
            tujuan = "Bekasi - Jogja";
            hargaTiket = 150000;
        }
        else if (pilihan == 5) {
            tujuan = "Bekasi - Surabaya";
            hargaTiket = 250000;
        }
        else {
            System.out.println("Pilihan tujuan tidak tersedia!");
            sc.close();
            return;
        }

        
        System.out.print("Masukkan jumlah tiket : ");
        jumlahTiket = sc.nextInt();

        if (jumlahTiket <= 0) {
            System.out.println("Jumlah tiket harus lebih dari 0!");
            sc.close();
            return;
        }

        
        totalBayar = hargaTiket * jumlahTiket;

        // Menampilkan hasil pembelian
        System.out.println("\n==================================");
        System.out.println("       DETAIL PEMBELIAN TIKET");
        System.out.println("==================================");
        System.out.println("Nama pemesan  : " + nama);
        System.out.println("Tujuan        : " + tujuan);
        System.out.println("Jumlah tiket  : " + jumlahTiket);
        System.out.println("Harga tiket   : Rp" + hargaTiket);
        System.out.println("----------------------------------");
        System.out.println("Total bayar   : Rp" + totalBayar);
        System.out.println("==================================");

        sc.close();
    }
}
