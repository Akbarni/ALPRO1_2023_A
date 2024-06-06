package latihan4;

import java.util.Scanner;

public class SearchMahasiswa {
    static class Mahasiswa {
        String nama;
        int nim;

        public Mahasiswa(String nama, int nim) {
            this.nama = nama;
            this.nim = nim;
        }
    }

    public static int binarySearch(Mahasiswa[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m].nim == x)
                return m;
            if (arr[m].nim < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static int sequentialSearch(Mahasiswa[] arr, int x) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].nim == x)
                return i;
        return -1;
    }

    public static void displayMahasiswaList(Mahasiswa[] arr) {
        System.out.println("List of Mahasiswa:");
        for (Mahasiswa mahasiswa : arr) {
            System.out.println("Nama: " + mahasiswa.nama + ", NIM: " + mahasiswa.nim);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mahasiswa[] arr = {
                new Mahasiswa("Rafli", 223040010),
                new Mahasiswa("Akbar", 223040028),
                new Mahasiswa("Asep", 223040022),
                new Mahasiswa("Dani", 223040011),
                new Mahasiswa("Uken", 223040017)
        };

        displayMahasiswaList(arr);

        System.out.print("Masukkan NIM mahasiswa yang ingin dicari: ");
        int x = scanner.nextInt();
        int binaryResult = binarySearch(arr, x);
        int sequentialResult = sequentialSearch(arr, x);

        if (binaryResult != -1) {
            System.out.println("Hasil pencarian: Mahasiswa dengan NIM " + x + " ditemukan.");
            System.out.println("Nama: " + arr[binaryResult].nama + ", NIM: " + arr[binaryResult].nim);
        } else if (sequentialResult != -1) {
            System.out.println("Hasil pencarian: Mahasiswa dengan NIM " + x + " ditemukan.");
            System.out.println("Nama: " + arr[sequentialResult].nama + ", NIM: " + arr[sequentialResult].nim);
        } else {
            System.out.println("Hasil pencarian: Mahasiswa dengan NIM " + x + " tidak ditemukan.");
        }

        scanner.close();
    }
}
