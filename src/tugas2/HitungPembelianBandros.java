package tugas2;

import java.util.Scanner;

public class HitungPembelianBandros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahUang, hargaBarang, jumlahBeli, sisaUang;
        
        System.out.print("Masukkan jumlah uang: ");
        jumlahUang = input.nextInt();
        
        System.out.print("Masukkan harga barang: ");
        hargaBarang = input.nextInt();
        
        jumlahBeli = 0;
        
        while (jumlahUang >= hargaBarang) {
            jumlahUang = jumlahUang - hargaBarang;
            jumlahBeli++;
        }
        
        sisaUang = jumlahUang;
        
        System.out.println("Sisa uang: " + sisaUang);
        System.out.println("Jumlah pembelian: " + jumlahBeli);
    }
}

