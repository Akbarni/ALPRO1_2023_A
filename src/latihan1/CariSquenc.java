package latihan1;

import java.util.Scanner;

public class CariSquenc {
    int N = 5;
    int []a = new int[N];
//    prosedur
    void isiArray() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<N) {
            System.out.println("Element Ke " + i + ":");
            a[i] = sc.nextInt();
            i = i + 1;
        }
    }
    
    void TampilArray() {
        int i = 0;
        while (i<N) {
            System.out.println("Array ke" + i + " = " + a[i]);
            i = i +1;
        }
    }
    
    void CariSeq(int x) {
        
        int i = 0;
        while((i < N - 1) && (a[i] != x)) {
            i = i+1;
        }
        
        if(a[i] == x) {
            System.out.println("KETEMU! Ada di index " + i);
        } else {
            System.out.println("Tidak ketemu");
        }
        
    }

	 void CariSeq2(int x) {
	        
		 	boolean keluar = false;
	        int i = 0;
	        int y = 0;
	        while((i < N) && (keluar == false)) {
	        	if(a[i] == x) {
	        		keluar = true;
	        		y = i;
	 	        } else {
	 	        	i = i+1;
	 	        }
	        }
	        
	        if(keluar == true) {
	        	 System.out.println("KETEMU! Ada di index " + y);
	        } else {
	        	   System.out.println("Tidak ketemu");
	        }
	         
	       
	        
	    }
	 
	 void CariBinary(int x) {
	        int awal = 0;
	        int akhir = N - 1;
	        int tengah;

	        while (awal <= akhir) {
	            tengah = (awal + akhir) / 2;

	            if (a[tengah] == x) {
	                System.out.println("KETEMU! Ada di index " + tengah);
	                return;
	            } else if (a[tengah] < x) {
	                awal = tengah + 1;
	            } else {
	                akhir = tengah - 1;
	            }
	        }

	        System.out.println("Tidak ketemu");
	    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        CariSquenc A = new CariSquenc();
        A.isiArray();
        A.TampilArray();
        System.out.println(" ");
        for(int i = 0; i < 3; i++) {
            System.out.println("Mau nyari apa?");
            int x = sc.nextInt();
            A.CariBinary(x);

            System.out.println(" ");
        }
    }

}