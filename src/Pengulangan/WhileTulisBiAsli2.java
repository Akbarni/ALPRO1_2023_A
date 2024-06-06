package Pengulangan;

import java.util.Scanner;

public class WhileTulisBiAsli2 {
	public static void main(String[] args) {
		int JumlahMhs, BesarDonasi;
		Scanner sc=new Scanner (System.in);
		System.out.println("Jumlah Mahasiswa:") ;JumlahMhs=sc.nextInt();
		
		int i=1;
		int k=0;
		while (i <= JumlahMhs) {
		    System.out.println("Besar Donasi ke "+i+":");BesarDonasi=sc.nextInt();
		    k=k+BesarDonasi;
		    i =i+1;
		}
		System.out.println("Besar Total Donasi = "+k);

    }
}