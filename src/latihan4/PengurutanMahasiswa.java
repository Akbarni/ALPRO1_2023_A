package latihan4;

import java.util.Arrays;
import java.util.Scanner;

public class PengurutanMahasiswa {
    String nim;
    String nama;
    double ipk;

    public PengurutanMahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public static PengurutanMahasiswa searchByNIM(PengurutanMahasiswa[] arr, String targetNIM) {
        for (PengurutanMahasiswa mhs : arr) {
            if (mhs.nim.equals(targetNIM)) {
                return mhs;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        PengurutanMahasiswa[] mahasiswas = {
                new PengurutanMahasiswa("223040028", "Akbar", 3.9),
                new PengurutanMahasiswa("22304001", "Udik", 3.2),
                new PengurutanMahasiswa("22304003", "Asep", 3.8),
                new PengurutanMahasiswa("22304014", "Eep", 3.8),
                new PengurutanMahasiswa("22304015", "Pitung", 3.8)
        };

        System.out.println("Data mahasiswa sebelum diurutkan:");
        for (PengurutanMahasiswa mhs : mahasiswas) {
            System.out.println(mhs.nim + " " + mhs.nama + " " + mhs.ipk);
        }

        // Sorting by NIM (ascending order)
        Arrays.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));

        System.out.println("\nData mahasiswa setelah diurutkan berdasarkan NIM:");
        for (PengurutanMahasiswa mhs : mahasiswas) {
            System.out.println(mhs.nim + " " + mhs.nama + " " + mhs.ipk);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan NIM yang dicari: ");
        String targetNIM = scanner.nextLine();
        PengurutanMahasiswa result = searchByNIM(mahasiswas, targetNIM);

        if (result != null) {
            System.out.println("\nData mahasiswa dengan NIM " + targetNIM + " ditemukan:");
            System.out.println(result.nim + " " + result.nama + " " + result.ipk);
        } else {
            System.out.println("\nData mahasiswa dengan NIM " + targetNIM + " tidak ditemukan.");
        }

        scanner.close();
    }
}
