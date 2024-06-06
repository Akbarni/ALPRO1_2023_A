package pencabangan;

import java.util.Scanner;

public class OperasiLogikString {
    public static void main (String[] args) {
        String nama1="Santi", nama2="Sinta", nama3="";
        boolean hasil;

        hasil= nama1.equals("santi");
        System.out.println("nama==\"santi\" "+ hasil);

        hasil= nama1.equalsIgnoreCase("santi");
        System.out.println("nama== \"santi\" "+ hasil);

        hasil= nama1.isEmpty();
        System.out.println("nama== \"\" "+ hasil);

        hasil= nama3.isEmpty();
        System.out.println("nama3== \"\" "+ hasil);


    }

        
        
}