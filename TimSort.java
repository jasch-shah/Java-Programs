import java.util.*;
import java.io.*;
import  java.lang.Math.min;

class TimSort
{
	final static  int RUN = 32;
	static void insertionSort(int arr[],int left,int right)
	{
		for(int i=left+1;i<=right;i++)
		{
			int temp = arr[i];
			int j=i-1;
			while(arr[j]>temp && j>=left)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}

	static void merge(int arr[],int l,int m, int r)
	{
		int len1=m-l+1;
		int len2=r-m;
		int left[] = new int[len1];
		int right[] = new int[len2];
		for(int i=0;i<len1;i++)
			left[i]=arr[l+i];
		for(int j=0;j<len2;j++)
			right[j]=arr[m+1+j];

		int i=0,j=0,k=l;

		while (i<len1 && j<len2) {
			if(left[i] <= right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
			
		}
		while(i<len1)
		{
			arr[k]=left[i];
			k++;
			i++;
		}
		while(j<len1)
		{
			arr[k]=right[j];
			k++;
			j++;
		}


	}
	static void timSort(int arr[],int n)
	{
		for(int i=0;i<n;i+=RUN)
			insertionSort(arr,Math.min((i+31),(n-1)));

		for(int size=RUN;size<n;size = 2*size)
		{
			for(int left=0;left<n;left+=2*size)
			{
				int mid = left+size-1;
				int right=Math.min((left+2*size-1),(n-1));

				merge(arr,left,mid,right);
			}
		}
	}

	static void printArray(int arr[],int n)
	{
		for (int i = 0;i<n ; i++) 
			System.out.print(arr[i]+" ");
		System.out.println();

		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Given Array is ");
		printArray(arr,n);
		timSort(arr,n);
		System.out.println("After sorting  Array is ");
		printArray(arr,n);
	}
}