//Find the minimum element in a sorted and rotated array
/*

Input:{5,6,1,2,3,4}
Output: 1

Input: {1,2,3,4}
Output: 1

*/

import java.lang.*;
import java.io.*;
import java.util.*;

class MinNum {
	static int findMin(int arr[], int low, int high)
	{
		// need to handle the case when is not rotated
		if(high < low)	return arr[0];

		//if only one element in array
		if(high == low)	return arr[low];

		//find mid
		int mid = low + (high - low) / 2;
		//check if mid+1 is minimum or not
		if(mid < high && arr[mid+1] < arr[mid])
			return arr[mid+1];

		//check if mid itself is minimum
		if(mid > low && arr[mid] < arr[mid-1])
			return arr[mid];
		//decide whether go to left or right
		if(arr[high] > arr[mid])
			return findMin(arr, low, mid-1);
		return findMin(arr, mid+1, high);


	}

	public static void main(String[] args) {

		int arr1[] = {5, 6, 1, 2, 3, 4};
		int n1 = arr1.length;
		System.out.println("The minimum element is "+findMin(arr1, 0, n1-1));

		int arr2[] = {1, 2, 3, 4};
		int n2 = arr2.length;
		System.out.println("The minimum element is "+findMin(arr2, 0, n2-1));

		int arr3[] = {7, 2, 5, 15, 6};
		int n3 = arr3.length;
		System.out.println("The minimum element is "+findMin(arr3, 0, n3-1));

		int arr4[] = {123, 134, 108, 56};
		int n4 = arr4.length;
		System.out.println("The minimum element is "+findMin(arr4, 0, n4-1));

		int arr5[] = {2,3,1};
		int n5 = arr5.length;
		System.out.println("The minimum element is "+findMin(arr1, 0, n5-1));

		


	}
}