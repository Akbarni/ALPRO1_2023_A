package array;

public class Bubblesort {
	

	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = n - 1; j > i; j--) {
	                if (arr[j] < arr[j - 1]) {
	                    // Pertukaran elemen
	                    int temp = arr[j];
	                    arr[j] = arr[j - 1];
	                    arr[j - 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 4, 3, 2, 1}; // Anda dapat mengganti nilai-nilai ini sesuai kebutuhan

	        System.out.println("Array sebelum diurutkan:");
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }

	        bubbleSort(arr);

	        System.out.println("\nArray setelah diurutkan:");
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	    }
	}

