
package INTRODUCTION;
import java.util.Scanner;
public class CaseJumlahHariTiapBulan {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a Bulan: ");
			int number = input.nextInt();

			switch(number) {
			    case 1:
			        System.out.println("Januari 31 Hari");
			        break;
			    case 2:
			        System.out.println("Februari 28 Hari");
			        break;
			    case 3:
			        System.out.println("Maret 31 Hari");
			        break;
			    case 4:
			        System.out.println("April 30 Hari");
			        break;
			    case 5:
			        System.out.println("Mei 31 Hari");
			        break;
			    case 6:
			        System.out.println("Juni 30 Hari");
			        break;
			    case 7:
			        System.out.println("Juli 31 Hari");
			        break;
			    case 8:
			        System.out.println("Agustus 31 Hari");
			        break;
			    case 9:
			        System.out.println("September 30 Hari");
			        break;
			    case 10:
			        System.out.println("Oktober 31 Hari");
			        break;
			    case 11:
			        System.out.println("November 30 Hari");
			        break;
			    case 12:
			        System.out.println("December 31 Hari");
			        break;
			    default:
			    	System.out.println("Error");
			    	break;
			}

			
		}
    }
}