import java.util.*;

class SelectionSort
{
	void sort(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min_index = i;
			for(int j=i+1;j<n;j++)
				if(arr[j] < arr[min_index])
					min_index=j;

				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
		}
	}
	void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		SelectionSort ss = new SelectionSort();
		ss.sort(arr,n);
		System.out.println("Sorted Array is");
		ss.printArray(arr, n);
	}
}