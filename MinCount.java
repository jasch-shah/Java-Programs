import java.util.*;
class MinCount{
	static int binarySearch(int arr[], int n, int key)
	{
		int left=0,right=n;
		int mid=0;
		while(left < right){
		mid = left + (right-left)/2;

		if(arr[mid] == key){
			while(arr[mid+1] == key && mid<n)
				mid++;
			break;
		}

		//if key is smaller ignore right half
		else if(arr[mid] > key)
			right = mid;
		//if key is larger, ignore left half
		else
			left = mid + 1;


		}
		while(arr[mid] > key)
			mid--;

		return mid+1;

	}
	public static void main(String[] args) {
		int testcase;

		System.out.println("Enter no of testcases");
		Scanner sc = new Scanner(System.in);
		testcase = sc.nextInt();
		while(testcase-- > 0){
			int n;
			System.out.println("Enter size of array");
			n = sc.nextInt();
			System.out.println("Enter array elements");
			int arr[] = new int[n];
			for(int i=0;i<arr.length;i++)
				arr[i] = sc.nextInt();
			System.out.println("Enter key");
			int key = sc.nextInt();

			System.out.print(binarySearch(arr, n, key));
		}
	}
}