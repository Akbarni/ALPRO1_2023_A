package Pengulangan;

import java.util.Scanner;

public class WhileLoginBebas {
	public static void main(String[] args) {
		String Pass;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Password anda:") ;Pass=sc.next();
		
		while (!Pass.contentEquals("$$$")) {
		    System.out.println("Password anda:");Pass=sc.next();
		   
		}

		System.out.println("Login Sukses ...");

    }
}