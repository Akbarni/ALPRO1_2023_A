package array;

public class LatArray {
	int [] arr= {5,6,7,1,10};
	int n=arr.length;
	
	
	void TampilArray() {
		for (int i=0;i<=n-1;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	void BubbleShort() {
		int temp=0;
		
		for (int i=0; i<= n-1; i++) {
			for (int j=n-1; i>=i+1; j--) {
				if (arr[j] >arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[i-1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		LatArray R = new LatArray();
		
		R.TampilArray();
		R.BubbleShort();
		R.TampilArray();
	}
}