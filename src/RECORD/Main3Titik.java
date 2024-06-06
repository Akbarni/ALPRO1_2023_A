package RECORD;

import java.util.Scanner;

public class Main3Titik {
	    // Tanpa record
	    public static void main(String[] args) {
	        int x, y; // titik T
	        int x2, y2; // titik T2
	        Scanner sc = new Scanner(System.in);
	        
	        // Input titik T
	        System.out.print("x : ");
	        x = sc.nextInt();
	        System.out.print("y : ");
	        y = sc.nextInt();

	        // Menampilkan nilai T yang telah diinput
	        System.out.println("Titik pertama: (" + x + "," + y + ")");
	        
	        // Input titik T2
	        System.out.print("x2: ");
	        x2 = sc.nextInt();
	        System.out.print("y2: ");
	        y2 = sc.nextInt();

	        // Menampilkan nilai T2 yang telah diinput
	        System.out.println("Titik kedua: (" + x2 + "," + y2 + ")");
	    }
	}

