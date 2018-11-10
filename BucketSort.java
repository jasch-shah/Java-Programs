import java.util.*;

class BucketSort
{
	static int[] sort(int arr[], int maxVal)
	{
		int bucket[] = new int[maxVal+1];
		int sort_seq[] = new int[arr.length];

		for(int i=0;i<arr.length;i++)
			bucket[arr[i]]++;

		int pos = 0;
		for(int i=0;i<bucket.length;i++)
			for(int j=0;j<bucket[i];j++)
				sort_seq[pos++] = i;


		return sort_seq;	
	}

	static void printArray(int sort_seq[])
	{
		for(int i=0;i<sort_seq.length;i++)
			System.out.print(sort_seq[i]+" ");
	}

	static int maxVal(int arr[])
	{
		int maxVal=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]>maxVal)
				maxVal=arr[i];

		return maxVal;	
	}

	public static void main(String[] args) {
		System.out.println("Sorting of random nos using bucket sort");
		Random random = new Random();
		int n=20;
		int arr[] = new int[n];

		for(int i=0;i<n;i++)
			arr[i] = Math.abs(random.nextInt(100));
		int maxVal = maxVal(arr);

		System.out.println("Original Array");
		printArray(arr);
		System.out.println("Sorted Sequence");
		printArray(sort(arr, maxVal));
	}
}