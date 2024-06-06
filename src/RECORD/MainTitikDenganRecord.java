package RECORD;

import java.util.Scanner;

public class MainTitikDenganRecord {
	public static void main (String []args) {
		Titik T=new Titik();
		
		Scanner sc=new Scanner (System.in);
		System.out.print("x :") ;T.x=sc.nextInt();
		System.out.print("y :") ;T.y=sc.nextInt();
		
		System.out.print("Titik : ("+T.x+","+ T.y+")");
		
	}
	
}
