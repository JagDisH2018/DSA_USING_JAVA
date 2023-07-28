package Sorting;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {92,82,43,57,79,11};
		int temp;
		//display
				System.out.println("Before Result......!!!!");
				for (int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");
				}

		
		for(int i=0; i<arr.length; i++) {
			int flag = 0;
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp =  arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		//display
		System.out.println("\nResult......!!!!");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
