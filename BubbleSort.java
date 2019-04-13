import java.util.Scanner;
public class BubbleSort {
	final static Scanner sc = new Scanner(System.in);
	public static int totalCount;
	public static void main(String[] args) {
		int l = sc.nextInt();		
		int[] arr = new int[l];//{3, 5, 32, 6, 34, 78, 54, 12};
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//printArray(arr);
		sort(arr);
	}

	public static void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int prevSwap = 0;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) { //exchange
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					prevSwap++;
				}
				totalCount ++;
				if(prevSwap == 0) break;
			}
		}
		//System.out.println();
		printArray(arr);
		System.out.println("Total count "+ totalCount);
	}

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
