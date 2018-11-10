import java.util.*;

class CountingSort
{
	void sort(char arr[])
	{
		int n = arr.length;
		char output[] = new char[n];
		//create arry to store count of individual character and 
		//initialize count array as 0
		int count[] = new int[256];
		for(int i=0;i<256;i++)
			count[i] = 0;
		//store count of each character
		for(int i=0;i<n;i++)
			count[arr[i]]++;

		//change count array so that it stores sum of its previous count values
		for(int i=1;i<=255;i++)
			count[i] += count[i-1];

		for(int i=0;i<n;i++)
		{
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for(int i=0;i<n;i++)
			arr[i] = output[i];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char arr[] = str.toCharArray();
		CountingSort cs = new CountingSort();
		cs.sort(arr);

		System.out.print("Sorted chracter array is ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
}