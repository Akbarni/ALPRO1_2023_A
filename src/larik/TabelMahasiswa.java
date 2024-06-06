package larik;
import java.util.Scanner;
public class TabelMahasiswa {
int N = 5;
int []a = new int[N];
// prosedur
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
public static void main(String[] args){
	TabelMahasiswa A = new TabelMahasiswa();
A.isiArray();
A.TampilArray();
}
}