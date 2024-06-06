package RECORD;

import java.util.Scanner;

public class Mahasiswa {
	
	int NIM;
	String Mahasiswa, KodeMK;
	float UTS, UAS, Prak, Quiz, Tgs, Hdr;
	double NA;
	char Idx;
	
	
	void BacaMhs() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("NIM : ");NIM=sc.nextInt();		
		System.out.print("NAMA : ");Mahasiswa=sc.next();	
		System.out.print("UTS : ");UTS=sc.nextFloat();
		System.out.print("UAS : ");UAS=sc.nextFloat();	
		System.out.print("Prak : ");Prak=sc.nextFloat();
		System.out.print("Quiz : ");Quiz=sc.nextFloat();
		System.out.print("Tugas : ");Tgs=sc.nextFloat();
		System.out.print("Kehadiran : ");Hdr=sc.nextFloat();
		NA = HitungNA();
		Idx = SetIndex();
		
	}
	
	
	void TampilMhs() {
		System.out.println("Mahasiswa :" +NIM);
		System.out.println("Nama :" +Mahasiswa);
		System.out.println("UTS :" +UTS); 
		System.out.println("UAS :"+UAS);
		System.out.println("Prak :"+Prak);
		System.out.println("Quiz :"+Quiz);
		System.out.println("Tugas :"+Tgs); 
		System.out.println("Hadir :" +Hdr);
		System.out.println("NA :" +NA);
		System.out.println("Idx :" + Idx);
	}
	
	double HitungNA() {
//		double Nas;
//		Nas = 0.3 * UTS + 0.3 * UAS + 0.2 * Prak + 	0.05 * Quiz + 0.10 * Tgs + 0.05 * Hdr;
//		return NA = Nas;
		return  0.3 * UTS + 0.3 * UAS + 0.2 * Prak + 	0.05 * Quiz + 0.10 * Tgs + 0.05 * Hdr;
	}
	
	
	char SetIndex() {
		char Index = 'T';
		
		if(NA >= 85) 
			Index = 'A';
			else if(NA >=75)
				Index = 'B';
				else if(NA>= 55)
					Index = 'C';
					else if (NA>=45)
						Index = 'D';
						else
							Index = 'E';
		
		return Index;
	}
	public static void main(String[] args){
		Mahasiswa M = new Mahasiswa();

		
	 M.BacaMhs();
	 M.TampilMhs();
		
		
		
	}
	


}