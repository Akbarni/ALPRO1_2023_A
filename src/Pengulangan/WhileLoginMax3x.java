package Pengulangan;

import java.util.Scanner;

public class WhileLoginMax3x {
	public static void main(String[] args) {
		String Pass;
		int i=1;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Password anda:") ;Pass=sc.next();
		
		while ((!Pass.contentEquals("$$$"))&&(i<3)) {
			i=i+1;
		    System.out.println("Password anda:");Pass=sc.next();
		   
		}

		System.out.println("Login Sukses ...");

    }
}