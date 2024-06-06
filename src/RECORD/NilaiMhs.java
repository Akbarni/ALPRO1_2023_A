package RECORD;

import java.util.Scanner;

public class NilaiMhs {
    int NRP;
    String Nama, kodemk;
    char Nilai;

    public static void main(String[] args) {
        NilaiMhs T = new NilaiMhs();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("NRP : ");
        T.NRP = sc.nextInt();

        System.out.print("Nama : ");
        T.Nama = sc.next();

        System.out.print("Kode mata kuliah : ");
        T.kodemk = sc.next();

        System.out.print("Index Nilai : ");
        T.Nilai = sc.next().charAt(0);

        System.out.println("NilMhs : (" + T.NRP + "," + T.Nama + "," + T.kodemk + "," + T.Nilai + ")");
    }
}
