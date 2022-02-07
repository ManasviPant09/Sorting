import java.util.Scanner;
class Insertion_Sort{
	void InsertionSort(int A[],int n){
		for(int i=0;i<n;i++){
	        for(int j=1;j<n;j++){
	            if(A[i]<A[j]){
	                int temp = A[i];
	                A[i] = A[j];
	                A[j] = temp;
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
public class InsertionSort {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Insertion_Sort o = new Insertion_Sort();
			System.out.println("Enter the number of elements you want in the array - ");
			int n= input.nextInt();
			int[] A = new int[n];
			for(int i=0;i<n;i++) {
				A[i] = input.nextInt();
			}
			System.out.println("The Sorted Array is - ");
			o.InsertionSort(A,n);
			o.printArray(A, n);
		}
	}
}
