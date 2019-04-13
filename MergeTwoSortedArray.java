public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int[] a = {3, 5, 7, 9};
		int[] b = {2, 4, 6, 8};
		// a and b are two printed array
		merge(a, b);
	}

	public static void merge(int[] a, int[] b) {
		// creating two array with same value of a and b, A and B.
		int[] A = new int[a.length + 1]; // length of A = length of a + 1
		int[] B = new int[b.length + 1]; // length of B = length of b + 1

		for(int i=0; i<a.length; i++) {  // copying the data from a to A 
			A[i] = a[i];
		}
		A[a.length] = Integer.MAX_VALUE;

		for(int i=0; i<b.length; i++) { // copying the data from b to B 
			B[i] = b[i];
		}
		B[b.length] = Integer.MAX_VALUE;

		//------------------------------------------------

		int[] masterArray = new int[a.length + b.length];  // creating masterarray

		int pointerOfA = 0;
		int pointerOfB = 0;

		for(int i=0; i<masterArray.length; i++) {  // adding data into masterarray in ascending order
			if(A[pointerOfA] < B[pointerOfB]) {
				masterArray[i] = A[pointerOfA];
				pointerOfA ++;
			} else {
				masterArray[i] = B[pointerOfB];
				pointerOfB ++;
			}
		}

		printArray(A);  // printing array A
		printArray(B);  // printing array B
		printArray(masterArray);  // printing array MasterArray
	}

	//print the array
	public static void printArray(int[] k) {
		for(int i : k) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
}