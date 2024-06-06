package tugas2;
import java.util.Scanner;

public class MenghitungBandros {

	public class HitungPembelianBandros {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Masukkan harga Bandros: ");
	        int hargaBandros = input.nextInt();

	        System.out.print("Masukkan jumlah uang Ali: ");
	        int jumlahUangAli = input.nextInt();

	        int jumlahPembelian = 0;
	        int sisaUang = jumlahUangAli;

	        while (sisaUang >= hargaBandros) {
	            jumlahPembelian++;
	            sisaUang -= hargaBandros;
	        }

	        System.out.println("Total pembelian Bandros oleh Ali: " + jumlahPembelian);
	        System.out.println("Sisa uang Ali setelah pembelian: " + sisaUang);
	    }
	}


}
