package INTRODUCTION;

import java.util.Scanner;

public class HitungLuasLingkaran {
	public static void main (String[] args) {
		int panjang,lebar,luas;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ketik panjang: ");panjang=sc.nextInt();
		System.out.print("ketik lebar: ");lebar=sc.nextInt();
		luas=panjang*lebar;
		System.out.println("luas "+ luas);
	}

}