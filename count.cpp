#include <iostream>
using namespace std;

int binarySearchCount(int arr[], int n, int key)
{
    int left=0,right=n;
    int mid;
    while(left<right){
        mid = left + (right-left)/2;
        //check if key is present
        if(arr[mid] == key){
            //return last position of that key
            while(arr[mid+1] == key && mid+1<n)
                mid++;
            break;
                
            
        } 
        //if key is smaller,ignore right half
        else if(arr[mid] > key) 
            right = mid;
            
        
        //if key is larger , ignore left half
        else
            left = mid + 1;
        
    }    
        //if key not found it will be before mid
        while(arr[mid] > key)
            mid--;
        
        
        return mid + 1;    
            
    
}

int main() {
	
	int testcases;
	cin>>testcases;
	while(testcases-- > 0)
	{
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    int key;
	    cin>>key;
	    cout<<binarySearchCount(arr,n, key );
	}
	return 0;
}