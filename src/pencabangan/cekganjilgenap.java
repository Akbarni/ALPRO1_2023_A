package pencabangan;

import java.util.Scanner;

public class cekganjilgenap {
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			if (number == 0) {
			    System.out.println("Number is zero");
			} else if (number % 2 == 0) {
			    System.out.println("Number is genap");
			} else if (number < 0) {
			    System.out.println("Number is negative");
			} else {
			    System.out.println("Number is ganjil");
			}
		}
    }
}