package Tugas3;

import java.util.Scanner;

class Jam {
    int jam, menit, detik;
    
    Scanner sc = new Scanner(System.in);
    
    void bacaJam() {
    	do {
    		System.out.print("Jam: ");
    		jam = sc.nextInt();
    	} while (jam < 0 || jam > 23);
    	
    	do {
    		System.out.print("Menit: ");
    		menit = sc.nextInt();
    	} while (menit < 0 || menit > 59);
    	
    	do {
    		System.out.print("Detik: ");
    		detik = sc.nextInt();
    	} while (detik < 0 || detik > 59);
    }
    
    void tulisJam() {
	    System.out.println(jam + ":" + menit + ":" + detik);
    }
    
    void ucapan() {
	    if (jam >= 0 && jam <= 5) {
	        System.out.println("Selamat subuh");
	    } else if (jam >= 6 && jam <= 10) {
	        System.out.println("Selamat pagi");
	    } else if (jam >= 11 && jam <= 15) {
	        System.out.println("Selamat siang");
	    } else if (jam >= 16 && jam <= 18) {
	        System.out.println("Selamat sore");
	    } else if (jam >= 19 && jam <= 23) {
	        System.out.println("Selamat malam");
	    }
    }
    
    public static void main(String[] args) {
        Jam J = new Jam();
	 
        J.bacaJam();
        J.tulisJam();
        J.ucapan();
    }
}