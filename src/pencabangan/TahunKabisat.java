package pencabangan;
import java.util.Scanner;
public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        
        boolean kabisat = false;
        
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    kabisat = true;
                }
            } else {
                kabisat = true;
            }
        }
        
        if (kabisat) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }
        
        input.close();
    }
}
