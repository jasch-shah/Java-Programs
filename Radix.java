import java.util.*;

class Radix
{
	static int getMax(int arr[], int n)
	{
		//gets max value in arr
		int max = arr[0];
		for(int i=1;i<n;i++)
			if(arr[i]>max)
				max = arr[i];
		return max;	
	}

	static void countSort(int arr[],int n,int exp)
	{
		//performs counting sort of arr[] according to digit represented 
		//by exp
		int output[] = new int[n];
		int count[] = new int[10];
		Arrays.fill(count,0);

		//store count in count[]
		for(int i=0;i<n;i++)
			count[(arr[i]/exp)%10]++;

		for(int i=1;i<10;i++)
			count[i] += count[i-1];

		for(int i=n-1;i>=0;i--)
		{
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[(arr[i]/exp)%10]--;

		}
		for(int i=0;i<n;i++)
			arr[i] = output[i];

	}

	static void radixsort(int arr[], int n)
	{
		int m = getMax(arr,n);
		for(int exp = 1;m/exp > 0;exp *= 10)
			countSort(arr,n,exp);
	}

	static void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		radixsort(arr,n);
		print(arr,n);

	}
}