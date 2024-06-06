package latihan4;

import java.util.Scanner;

public class Matriks {
    int N = 3;  // baris
    int M = 3;  // kolom
    int[][] a = new int[N][M];

    // PEMBUATAN TRANSPOSE DAN PERKALIAN 2 BUAH MATRIKS
    // JUMLAH BARIS A SAMA DENGNA JUMLAH KOLOM B
    void BacaMatrik() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Element ke: " + i + " kolom " + j);
                a[i][j] = sc.nextInt();
            }
        }
    }

    void TampilMatrik() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    int Get(int i, int j) {
        return a[i][j];
    }

    void Set(int i, int j, int x) {
        a[i][j] = x;
    }

    static void PenjumlahanMatrik(Matriks A, Matriks B, Matriks C) {
        int x, y;
        for (int i = 0; i < A.N; i++) {
            for (int j = 0; j < A.M; j++) {
                x = A.Get(i, j);
                y = B.Get(i, j);
                C.Set(i, j, x + y);
            }
        }
    }

    static void PenguranganMatrik(Matriks A, Matriks B, Matriks C) {
        int x, y;
        for (int i = 0; i < A.N; i++) {
            for (int j = 0; j < A.M; j++) {
                x = A.Get(i, j);
                y = B.Get(i, j);
                C.Set(i, j, x - y);
            }
        }
    }

    static boolean isSama(Matriks A, Matriks B) {
        boolean sama = true;
        int x, y;
        int i = 0;
        while ((i < A.N) && (sama == true)) {
            int j = 0;
            while ((j < A.M) && (sama == true)) {
                x = A.Get(i, j);
                y = B.Get(i, j);
                if (x != y) {
                    sama = false;
                } else {
                    j++;
                }
            }
            i++;
        }
        return sama;
    }

    void TampilDiagonal() {
        for (int i = 0; i < N; i++) {
            System.out.print(a[i][i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriks A = new Matriks();
        Matriks B = new Matriks();
        Matriks C = new Matriks();

        A.BacaMatrik();
        A.TampilMatrik();
        System.out.println("Tampil diagonal ");
        A.TampilDiagonal();

        B.BacaMatrik();
        B.TampilMatrik();

        // Uncomment the following lines if you want to perform operations
        // PenguranganMatrik(A, B, C);
        // C.TampilMatrik();
        // boolean sama = isSama(A, B);
        // System.out.println("Matriks A dan Matriks B sama adalah : " + sama);
    }
}
