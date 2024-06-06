package Tugas1;

import java.util.*;

public class Mahasiswa {
	String NRP,Nama;
	double UTS,UAS,Prak,Quiz,Tugas,Kehadiran,NA;
	char Indeks;
	Scanner sc = new Scanner (System.in);
	
	void BacaMahasiswa() {
		System.out.print("NRP : "); NRP = sc.next();
		System.out.print("Nama : "); Nama = sc.next();
		System.out.print("UTS : ");UTS = sc.nextDouble();
		System.out.print("UAS : "); UAS = sc.nextDouble();
		System.out.print("Prak : "); Prak = sc.nextDouble();
		System.out.print("Quiz : "); Quiz = sc.nextDouble();
		System.out.print("Tugas : "); Tugas = sc.nextDouble();
		System.out.print("Kehadiran : "); Kehadiran = sc.nextDouble();
	}
	
	double HitungNa() {
		NA = 0.3* UTS + 0.3 *UAS + 0.2 * Prak +0.05 * Quiz + 0.05 * Kehadiran + 0.1 * Tugas;
		return NA;
	}
	
	char nentuinIndeks() {
		if (NA >= 85) {
			Indeks = 'A';
		}else if (NA >=75) {
			Indeks = 'B';
		}else if (NA >=55) {
			Indeks = 'C';
		}else if (NA >=45) {
			Indeks = 'D';
		}else  {
			Indeks = 'E';
		}
		return Indeks;
		
	}
	void tulisMahasiwa() {
		System.out.println("NRP : "+ NRP);
		System.out.println("Nama : "+ Nama);
		System.out.println("UTS: "+ UTS);
		System.out.println("UAS : "+ UAS);
		System.out.println("Prak : "+ Prak);
		System.out.println("Quiz : "+ Quiz);
		System.out.println("Tugas : "+ Tugas);
		System.out.println("Kehadiran : "+ Kehadiran);
		System.out.println("Nilai Akhir : "+ NA);
		System.out.println("Indeks : "+ Indeks);
		
		
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahasiswa M = new Mahasiswa();
		M.BacaMahasiswa();
		M.HitungNa();
		M.nentuinIndeks();
		M.tulisMahasiwa();
		

	}

}
