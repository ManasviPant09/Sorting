import java.util.Scanner;
class Bubble_Sort{
	void BubbleSort(int A[],int n){
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(A[j]>A[j+1]) {
					int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
				}
			}
		}
	}
	 void printArray(int A[],int n){
		 for (int i=0; i<n; ++i)
			 System.out.print(A[i] + " ");
		 System.out.println();
		 }
}
public class BubbleSort {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Bubble_Sort o = new Bubble_Sort();
			System.out.println("Enter the number of elements you want in the array - ");
			int n= input.nextInt();
			int[] A = new int[n];
			for(int i=0;i<n;i++) {
				A[i] = input.nextInt();
			}
			System.out.println("The Sorted Array is - ");
			o.BubbleSort(A,n);
			o.printArray(A, n);
		}
	}
}
