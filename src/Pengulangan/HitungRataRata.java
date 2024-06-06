package Pengulangan;

import java.util.Scanner;

public class HitungRataRata {
	public static void main(String[] args) {
		int JumlahMhs;
		float Nilai;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Jumlah Mahasiswa:") ;JumlahMhs=sc.nextInt();
		
		int i=1;
		int k=0;
		while (i <= JumlahMhs) {
		    System.out.println("Nilai mhs ke "+i+":");Nilai=sc.nextInt();
		    k=(int) (k+Nilai);
		    i =i+1;
		}
		System.out.println("Total Nilai = "+k);
		float Rata=k/JumlahMhs;
		System.out.println("Nilai Rata-Rata ="+Rata);

    }
}