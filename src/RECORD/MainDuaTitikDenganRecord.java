package RECORD;

import java.util.Scanner;

public class MainDuaTitikDenganRecord {
	public static void main (String []args) {
		Titik T=new Titik();
		Titik T2=new Titik();
		
		Scanner sc=new Scanner (System.in);
		System.out.print("x :") ;T.x=sc.nextInt();
		System.out.print("y :") ;T.y=sc.nextInt();
		
		System.out.print("Titik : ("+T.x+","+ T.y+")");
		
		System.out.print("x :") ;T2.x=sc.nextInt();
		System.out.print("y :") ;T2.y=sc.nextInt();
		
		System.out.print("Titik : ("+T2.x+","+ T2.y+")");
		
	}
	
}
