package ARSIP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileMhs {
	
	void SaveFileMhs() {
		Mahasiswa Mhs = new Mahasiswa(0, null, 0);
		int no;
		String nama;
		Float IP;
		
		ObjectOutputStream out = null;
		try {
//			buatfilenya dlu
			out = new ObjectOutputStream(new FileOutputStream("A:\\Files\\ECLIPSE WORKSPACE\\DIRECTORY_ARSIP\\Nasabah.dat" + ""));
			Scanner sc = new Scanner(System.in);
//			TRANVERSAL
			for(int i = 0; i<3; i++) {
				
				System.out.println("NIM :");no = sc.nextInt();
				System.out.println("NAMA :");nama = sc.next();
				System.out.println("IP :");IP = sc.nextFloat();
				Mhs = new Mahasiswa(no, nama, IP);
				out.writeObject(Mhs);
			}
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	void BacaFileMhs() {
			
	}
	
public static void main (String[] args) {
		FileMhs F = new FileMhs();
		
		F.SaveFileMhs();
	}
}

